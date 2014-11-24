package exam.shop.mapper;

import exam.shop.dto.*;

public interface UserMapper {
	public abstract void registerUser(User user);
	public abstract User getUserByUserId(User user);
	
	public String getPassword(String userId);
}
