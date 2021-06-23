package co.jp.socio.diversity.vos.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import co.jp.socio.diversity.vos.common.StringEncoder;
import co.jp.socio.diversity.vos.controller.MyErrorController;
import co.jp.socio.diversity.vos.form.UserForm;
import co.jp.socio.diversity.vos.model.UserInfo;

@Component
public class UserRepository extends AbstractRepository{
	Logger log = LogManager.getLogger(UserRepository.class);
	/*
	 * @Autowired JdbcTemplate jdbcTemplate;
	 */
	

	UserForm userForm;
	
	public List<UserInfo> getAllUsers() {
		try {
			//List<UserInfo> usernameList = new ArrayList<>();
			String sql = "select * from user_info";
			
			 List<Map<String, Object>> getList = jdbcManager.queryForList(sql);
			 List<UserInfo> userList = new ArrayList<>();
			 for (Map<String, Object> map : getList) {
				 UserInfo user = new UserInfo();
				// Userインスタンスに取得したデータをセットする
		         user.setUserLoginId((String) map.get("user_login_id")); //ユーザーID
				 //userForm.userLoginId=(String) map.get("user_id");
				// userForm.userName=(String) map.get("user_name");
				 
				 //user.setUserGroupId((int) map.get("user_id"));
				// user.setUserLoginId((String) map.get("user_login_id"));
		          log.info("User=" + userForm);
		          userList.add(user);
			 }
			 log.info("リスト=" + getList);
		      return userList;
			//usernameList.addAll(jdbcManager.queryForList(sql, String.class));
			//usernameList=jdbcManager.queryForList(sql.toString(),UserInfo.class);
			/*
			 * RowMapper<UserInfo> mapper = new
			 * BeanPropertyRowMapper<UserInfo>(UserInfo.class); ArrayList<UserInfo>
			 * usernameList = (ArrayList<UserInfo>) jdbcManager.query(sql, mapper); return
			 * usernameList;
			 */
		}
		 catch (Exception e) {
			 log.error("",e);
			 return null;
		 }
	}
	
	public boolean validateUser(String loginId, String password) {
		 try {
			 String sql = "select * from user_info where user_login_id=?";
			 UserInfo user = jdbcManager.queryForObject(sql, new Object[] {loginId}, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
				if (user == null) {
					return false;
				} else if (!password.equals(StringEncoder.restoreEncrypt(user.getUserPassword()))) {
					return false;
				}
				return true;
		 }
		 catch (EmptyResultDataAccessException e) {
			 	return false;
		 }
	}

	//List<UserInfo> findByEmailAddressAndLastname(EmailAddress emailAddress, String lastname);
	
}
