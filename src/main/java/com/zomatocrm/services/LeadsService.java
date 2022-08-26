package com.zomatocrm.services;

import java.util.List;

import com.zomatocrm.entities.Lead;

public interface LeadsService {
	
	public void saveLead(Lead lead);

	public Lead findLeadById(Long id);

	public void deleteLeadById(Long id);

	public List<Lead> listLeads();

}
