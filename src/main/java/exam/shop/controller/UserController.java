package exam.shop.controller;

import javax.validation.*;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.context.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import exam.shop.dto.User;
import exam.shop.security.*;
import exam.shop.service.*;

@Controller
public class UserController {
	@Autowired
	private ShopService shopService;
	
	private static final Logger logger 
	= LoggerFactory.getLogger(UserController.class);
	
	/*public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}*/
	
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
	
	// --------------------------------------------------------------
	// �α��ν�
	@RequestMapping(value="/securityLoginUser.shop")
	public String loginUser(ModelMap model) {
		/*logger.info("loginUser");*/
		model.addAttribute("user", new User());
		return "loginUser";
	}
	
	@RequestMapping(value="/loginUserProcess.shop")
	public void loginUserProcess() {
		Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
		
		String username = "";
		
		if (userDetails instanceof MyUserDetails) {
		  username = ((UserDetails) userDetails).getUsername();
		  logger.info("loginUserProcess1 : " + username);
		} else {
		  username = userDetails.toString();
		  logger.info("loginUserProcess2: " + username);
		}
		
		
	}
	
	@RequestMapping(value="/securityLoginSuccess.shop") 
	public String loginUserSuccess() {
		return "loginUserSuccess";
	}
	

}
