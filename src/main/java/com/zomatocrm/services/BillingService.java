package com.zomatocrm.services;

import java.util.List;

import com.zomatocrm.entities.Billing;

public interface BillingService {
	public void  createBill(Billing bill);

	public List<Billing> listAllBills();

}
