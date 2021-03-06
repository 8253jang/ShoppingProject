package exam.shop.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import exam.shop.dto.*;

@Component
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ItemCatalog itemCatalog;
	@Autowired
	private UserCatalog userCatalog;
	
	
	/*public void setItemCatalog(ItemCatalog itemCatalog) {
		this.itemCatalog = itemCatalog;
	}
	
	public void setUserCatalog(UserCatalog userCatalog) {
		this.userCatalog = userCatalog;
	}*/

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		
		List<Item> list = itemCatalog.getItemList();
		System.out.println("ShopService");
		return list;
	}

	@Override
	public Item getItemByItemId(int itemId) {
		// TODO Auto-generated method stub
		System.out.println("ShopService" + itemId);
		return itemCatalog.getItemByItemId(itemId);
	}

	@Override
	public User getUserByUserId(String userId, String userPwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		userCatalog.registerUser(user);
	}

}
