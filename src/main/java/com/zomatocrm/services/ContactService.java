package com.zomatocrm.services;

import java.util.List;

import com.zomatocrm.entities.Contact;

public interface ContactService {
	public void saveContactInfo(Contact contact);

	public List<Contact> listContacts();

	public Contact getContactInfo(long id);

}
