package exam.shop.dao;

import exam.shop.dto.*;

public interface UserDAO {
	
	// �α���
	User getUserByUserId(String userId, String userPwd);
	
	// ȸ������
	void registerUser(User user);
}
