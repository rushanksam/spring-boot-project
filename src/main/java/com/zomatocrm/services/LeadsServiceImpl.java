package com.zomatocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.repositories.LeadRepository;
@Service
public class LeadsServiceImpl implements LeadsService {

	@Autowired
	private LeadRepository leadRepo;
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
     }
	@Override
	public Lead findLeadById(Long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteLeadById(Long id) {
		leadRepo.deleteById(id);
		
	}
	@Override
	public List<Lead> listLeads() {
	List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
