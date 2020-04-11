package com.practice.express;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/processFormWithModel")
	public String displayFormdataFromModel(HttpServletRequest request, Model model) {
		
		//read the request parameter from HTML form
		String name = request.getParameter("EmployeeName");
		
		//Convert the data to all Caps
		name = name.toUpperCase();
		
		String result = "Yo!" + name;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "webpageform"; 
	}

} 
