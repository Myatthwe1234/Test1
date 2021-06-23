package co.jp.socio.diversity.vos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


/*@Entity
@Table(value = "user_info")*/

@Entity
@Table(name = "user_info")
public class UserInfo {
	
	@Id
    @GeneratedValue
	@Column(name = "user_id")
    private int userId;
	
	//@Column(nullable = false)
	@Column(name = "user_login_id")
	@NotBlank(message = "ログインIDは必要です。")
	private String userLoginId;
	
	@Column(name = "user_password")
	@NotBlank(message = "パスワードは必要です。")
	private String userPassword;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_group_id")
	private int userGroupId;
	
	public UserInfo() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}
	
}
