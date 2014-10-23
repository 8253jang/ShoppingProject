package exam.shop.service;

import java.util.*;

import exam.shop.dto.*;

public interface ItemCatalog {

	// 상품 전체 목록
	List<Item> getItemList();
	
	// 상품 상세 내용
	Item getItemByItemId(int itemId);
}
