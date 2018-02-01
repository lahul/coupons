package com.coupons.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coupons.entity.Contact;
import com.coupons.entity.Subscriber;

@RestController
public class UtilController {

	@PostMapping("/contact")
	public Contact contact(@RequestBody Contact contact) {
		return contact;
	}
	
	@PostMapping("/subscribe")
	public Subscriber subscriber(@RequestBody Subscriber subscriber) {
		return subscriber;
	}
	
}
