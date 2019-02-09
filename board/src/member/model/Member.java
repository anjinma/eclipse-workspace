package member.model;

import java.util.Date;

public class Member {

	private String id;
	private String name;
	private String password;
	private Date regdate;
	
	public Member(String id, String name, String password, Date regdate) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.regdate = regdate;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public Date getRegdate() {
		return regdate;
	}
	
	public boolean matchPassword(String pwd) {
		return password.equals(pwd);
	}
	
}
