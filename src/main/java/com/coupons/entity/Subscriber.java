package com.coupons.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscriber {

	@Id
	private int SubscriberId;
	
	private String email;

	public int getSubscriberId() {
		return SubscriberId;
	}

	public void setSubscriberId(int subscriberId) {
		SubscriberId = subscriberId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
