package auth.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.connection.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;

public class LoginService {

	private MemberDao memberDao = new MemberDao();
	
	public User Login(String id, String password) {
		try(Connection conn= ConnectionProvider.getConnection()){
			Member member = memberDao.selectById(conn, id);
			if(member == null) {
				// 회원정보에 없거나
				throw new LoginFailException();
			}
			if(!member.matchPassword(password)) {
				// 로그인시 비밀번호가 틀릴때?
				throw new LoginFailException();
			}
			return new User(member.getId(),member.getName());
			// 둘다 아니면 해당 아이디와 이름의 값을 가진 User객체를 리턴!
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
