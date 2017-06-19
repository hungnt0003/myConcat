package com.myContact.service;

import java.util.List;

import com.myContact.domain.Contact;

public interface IContactService {
	Iterable<Contact> findAll();

	List<Contact> search(String q);

	Contact findOne(int id);

	void save(Contact contact);

	void delete(int id);
}
