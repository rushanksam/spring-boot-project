package com.zomatocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.services.LeadsService;

@Controller
public class LeadController {
	@Autowired
    private LeadsService leadService;
	
	@GetMapping("/viewleadspage")
	public String viewLeadPage() {
		return "save_lead";
	}

	
	@PostMapping("/save")  //submit the data
	public String saveLead(Lead lead,ModelMap model) {
	leadService.saveLead(lead);
	model.addAttribute("lead", lead);
	return "lead_info";
	}
	@RequestMapping("/listleads")
	public String listAllLeads(ModelMap modelMap) {
		List <Lead> leads = leadService.listLeads();
		modelMap.addAttribute("leads", leads);
		return "list_leads";
	}
	@RequestMapping("/getLead")
	public String getLead(@RequestParam("id") long id,ModelMap modelMap) {
		Lead lead = leadService.findLeadById(id);
		modelMap.addAttribute("lead", lead);
		return"lead_info";
	}
	
	
}
