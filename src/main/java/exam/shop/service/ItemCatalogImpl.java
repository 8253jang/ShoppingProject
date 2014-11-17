package exam.shop.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import exam.shop.dao.*;
import exam.shop.dto.*;

@Component
public class ItemCatalogImpl implements ItemCatalog {

	@Autowired
	private ItemDAOImpl itemDAOImpl;
	
	/*public void setItemDAOImpl(ItemDAOImpl itemDAOImpl) {
		this.itemDAOImpl = itemDAOImpl;
	}*/

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		
		List<Item> list = itemDAOImpl.findAll();
		System.out.println("ItemCatalogImpl");
		return list;
	}

	@Override
	public Item getItemByItemId(int itemId) {
		// TODO Auto-generated method stub
		System.out.println("ItemCatalogImpl" + itemId);
		return itemDAOImpl.findByItemId(itemId);
	}

}
