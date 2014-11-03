package exam.shop.dao;

import java.sql.*;

import org.springframework.jdbc.core.*;

import exam.shop.dto.*;

public class UserDAOImpl implements UserDAO {
	private JdbcTemplate jdbcTemplate;

	// DataSource 이용해서 DataBase 연결
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User getUserByUserId(String userId, String userPwd) {
		// TODO Auto-generated method stub
		String sql = "select * from users where user_id=? and user_pwd=?";
		
		User user = jdbcTemplate.queryForObject(sql, 
				new Object[] {userId, userPwd}, new RowMapper<User>(){

					@Override
					public User mapRow(ResultSet rs, int arg1)
							throws SQLException {
						// TODO Auto-generated method stub
						User user = new User(
								rs.getString("user_id"), 
								rs.getString("user_pwd"), 
								rs.getString("user_name"));
						
						return user;
					}
		});
		
		return user;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		String sql ="insert into users values(?, ?, ?)";
		
		int result = jdbcTemplate.update(sql, 
				user.getUserId(), 
				user.getUserPwd(), 
				user.getUserName());
	}
}