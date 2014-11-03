package exam.shop.dto;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;

public class User {
	@NotEmpty 
	private String userId;
	private String userPwd;
	@Size(min=4, max=10)
	private String userName;
	
	public User() {
		
	}
	
	public User(String userId, String userPwd, String userName) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}

