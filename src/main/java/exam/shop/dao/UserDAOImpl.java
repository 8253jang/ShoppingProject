package exam.shop.dao;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import exam.shop.dto.*;

@Component
public class UserDAOImpl implements UserDAO {
	@Autowired
	//private JdbcTemplate jdbcTemplate;
	private SqlSession sqlSession;

	// DataSource 이용해서 DataBase 연결
	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	@Override
	public User getUserByUserId(String userId, String userPwd) {
		// TODO Auto-generated method stub
		/*String sql = "select * from users where user_id=? and user_pwd=?";
		
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
		
		return user;*/
		
		return null;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		/*String sql ="insert into users values(?, ?, ?)";
		
		int result = jdbcTemplate.update(sql, 
				user.getUserId(), 
				user.getUserPwd(), 
				user.getUserName());*/
		
		sqlSession.insert("exam.shop.mapper.UserMapper.registerUser", user);
	}

	@Override
	public String getPassword(String userId) {
		// TODO Auto-generated method stub
		
		User user = (User) sqlSession.selectOne("exam.shop.mapper.UserMapper.getPassword", userId);
		
		return user.getUserPwd();
	}
}