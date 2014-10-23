package exam.shop.dao;

import java.util.*;

import exam.shop.dto.*;

public interface ItemDAO {
	// 상품 리스트 
	/**
	 * @return 상품리스트 반환
	 */
	List<Item> findAll();
	
	// 상품 상세내용
	/**
	 * @param itemId 상품코드
	 * @return 상품 정보 반환
	 */
	Item findByItemId(int itemId);
}
