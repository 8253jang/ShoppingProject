package exam.shop.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import exam.shop.dao.*;
import exam.shop.dto.*;
@Component
public class UserCatalogImpl implements UserCatalog {
	@Autowired
	private UserDAOImpl userDAOImpl;
	
	/*public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}*/

	@Override
	public User getUserByUserId(String userId, String userPwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		userDAOImpl.registerUser(user);
	}

}
