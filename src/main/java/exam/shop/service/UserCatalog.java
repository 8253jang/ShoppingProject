package exam.shop.service;

import exam.shop.dto.*;

public interface UserCatalog {

	User getUserByUserId(String userId, String userPwd);
	void registerUser(User user);
}
