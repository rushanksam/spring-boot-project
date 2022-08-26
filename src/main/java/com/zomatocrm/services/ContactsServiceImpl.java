package com.zomatocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomatocrm.entities.Contact;
import com.zomatocrm.repositories.ContactRepository;
@Service
public class ContactsServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContactInfo(Contact contact) {
		contactRepo.save(contact);

	}

	@Override
	public List<Contact> listContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactInfo(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
		
	}

}
