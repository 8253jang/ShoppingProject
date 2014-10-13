package exam.shop.controller;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ListController {

	private static final Logger logger = LoggerFactory.getLogger(ListController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/list.shop", method = RequestMethod.GET)
	public String home() {
				
		return "list";
	}
	
}
