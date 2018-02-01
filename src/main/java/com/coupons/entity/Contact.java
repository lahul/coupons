package com.coupons.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	private String ContactId;
	
	private String Name;
	
	private String Email;
	
	private String Phone;
	
	private String Message;

	public String getContactId() {
		return ContactId;
	}

	public void setContactId(String contactId) {
		ContactId = contactId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	
	
}
