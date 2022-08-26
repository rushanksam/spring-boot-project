package com.zomatocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Billing;
import com.zomatocrm.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void createBill(Billing bill) {
		billingRepo.save(bill);
	}

	@Override
	public List<Billing> listAllBills() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

}
