package exam.shop.service;

import java.util.*;

import exam.shop.dto.*;

public class ShopServiceImpl implements ShopService {
	private ItemCatalog itemCatalog;
	
	public void setItemCatalog(ItemCatalog itemCatalog) {
		this.itemCatalog = itemCatalog;
	}

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		
		List<Item> list = itemCatalog.getItemList();
		
		return list;
	}

}
