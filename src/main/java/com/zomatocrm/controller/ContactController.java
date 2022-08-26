package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Contact;
import com.zomatocrm.entities.Lead;
import com.zomatocrm.services.ContactService;
import com.zomatocrm.services.LeadsService;

@Controller
public class ContactController {
	
	@Autowired
	private LeadsService leadService;
	
	@Autowired
	private ContactService  contactService;
	
	
	@RequestMapping("/saveContact")
	public String saveContact(@RequestParam("id") Long id,ModelMap modelMap) {
		Lead lead = leadService.findLeadById(id);
		Contact contact = new Contact(lead.getFirstName(), lead.getLastName(), lead.getEmail(), lead.getMobile(), lead.getLeadSource());
		contactService.saveContactInfo(contact);
		leadService.deleteLeadById(id);
		return "list_contacts";
	}
	@RequestMapping("/listcontacts")
	public String listAllContacts(ModelMap modelMap) {
		List <Contact> contacts = contactService.listContacts();
		modelMap.addAttribute("contacts", contacts);
		return "list_contacts";
	}

}
