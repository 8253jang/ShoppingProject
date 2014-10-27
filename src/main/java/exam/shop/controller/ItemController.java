package exam.shop.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import exam.shop.dto.*;
import exam.shop.service.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ItemController {
	@Autowired
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	
	// 상품 전체 목록
	@RequestMapping(value="/listItem.shop")
	public ModelAndView listItem() {
		ModelAndView mav = new ModelAndView();
		List<Item> listItem = shopService.getItemList();

		mav.setViewName("listItem");
		mav.addObject("listItem", listItem);
		return mav;
	}
	
	// 상품 상세 페이지
	@RequestMapping(value="/detailItem.shop")
	public ModelAndView detailItem(int itemId) {
		ModelAndView mav = new ModelAndView();
		
		
		mav.setViewName("detailItem");
		mav.addObject("detailItem", shopService.getItemByItemId(itemId));
		
		return mav;
	}
}
