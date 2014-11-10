package exam.shop.controller;

import javax.validation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import exam.shop.dto.*;
import exam.shop.service.*;

@Controller
public class UserController {
	@Autowired
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	
	// ó�� ȸ������ ��ũ��
	@RequestMapping(value="/registerUser.shop", method=RequestMethod.GET)
	public String registerForm(ModelMap model) {
		model.addAttribute("user", new User());
		return "registerUser";
	}
	
	// ȸ������ ��ư�� ��������
	@RequestMapping(value="/registerUser.shop", method=RequestMethod.POST)
	public String registerUser(@Valid User user, BindingResult result) {
		
		// ȸ������ ����
		if(result.hasErrors()) {
			return "registerUser";
		}
		// ȸ������ ����
		else {
			shopService.registerUser(user);
			return "redirect:/listItem.shop";
		}
	}
	
	

}
