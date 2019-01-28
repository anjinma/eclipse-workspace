package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class DeleteMessageService {

	private static DeleteMessageService instance = new DeleteMessageService();
	
	public static DeleteMessageService getInstance() {
		return instance;
	}
	private DeleteMessageService() {}
	
	public void deleteMessage(int messageId,String password) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			//트랜잭션 시작!
			conn.setAutoCommit(false);
			
			MessageDao messageDao = MessageDao.getInstance();
			Message message = messageDao.select(conn, messageId);
			
			if(message == null) {
				throw new MessageNotFoundException("메시지 없음!");
			}
			if(!message.matchPassword(password)) {
				throw new InvalidPasswordException("bad Password!");
			}
			messageDao.delete(conn, messageId);
			//트랜잭션 커밋
			conn.commit();
		} catch(SQLException ex) {
			JdbcUtil.rollback(conn);
			throw new ServiceException("삭제 실패: "+ex.getMessage(),ex);
		} catch(InvalidPasswordException | MessageNotFoundException ex) {
			JdbcUtil.rollback(conn);
			throw ex;
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
