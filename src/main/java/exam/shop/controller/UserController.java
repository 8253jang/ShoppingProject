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
	
	// 처음 회원가입 링크시
	@RequestMapping(value="/registerUser.shop", method=RequestMethod.GET)
	public String registerForm(ModelMap model) {
		model.addAttribute("user", new User());
		return "registerUser";
	}
	
	// 회원가입 버튼을 눌렀을때
	@RequestMapping(value="/registerUser.shop", method=RequestMethod.POST)
	public String registerUser(@Valid User user, BindingResult result) {
		
		// 회원가입 실패
		if(result.hasErrors()) {
			return "registerUser";
		}
		// 회원가입 성공
		else {
			shopService.registerUser(user);
			return "redirect:/listItem.shop";
		}
	}
	
	// --------------------------------------------------------------
	// 로그인시
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
