package com.practice.express;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormWebPageController {
	
	@RequestMapping("/displayForm")
	public String displayForm() {
		return "displayform-page";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "webpageform";
		
	}

} 
