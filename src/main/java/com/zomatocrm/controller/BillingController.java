package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Billing;
import com.zomatocrm.entities.Contact;
import com.zomatocrm.services.BillingService;
import com.zomatocrm.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String generateBill(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.getContactInfo(id);
		model.addAttribute("contact",contact);
		return "new_bill";
	}
	
	@RequestMapping("/createBill")
	public String createBill(Billing bill,ModelMap model) {
		billingService.createBill(bill);
		List <Billing> bills = billingService.listAllBills();
		model.addAttribute("bills",bills);
		
		return "list_billing";
	}
	

}
