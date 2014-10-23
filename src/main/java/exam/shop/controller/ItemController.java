package exam.shop.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import exam.shop.service.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ItemController {
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	
	// 상품 전체 목록
	@RequestMapping(value="/listItem.shop")
	public ModelAndView listItem() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("listItem");
		mav.addObject("listItem", shopService.getItemList());
		
		return mav;
	}
	
	// 상품 상세 페이지
	@RequestMapping(value="/detailItem.shop")
	public ModelAndView detailItem() {
		
		return null;
	}
}
