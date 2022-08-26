package com.zomatocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.utilities.EmailService;

@Controller
public class EmailController {
	  @Autowired
	  private EmailService emailService;
	@RequestMapping("/compose")
	public String getEmailId(@RequestParam("email") String email,ModelMap model){
		model.addAttribute("email",email);
		return "compose_email";
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email")String email,@RequestParam("sub")String sub,@RequestParam("message")String message,ModelMap modelMap) {
		emailService.sendSimpleMessage(email,sub,message);
		modelMap.addAttribute("msg","Email Sent!!");
		return "compose_email";
		
	}

}
