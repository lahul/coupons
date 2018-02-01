package com.coupons.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	private int id;
	
	private String userName;
	
	@NotNull
	private String Name;
	
	private String Email;
	
	private String Password;
	
	private String Phone;
	
	private int CouponsUsed;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Coupons> coupons=new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public int getCouponsUsed() {
		return CouponsUsed;
	}

	public void setCouponsUsed(int couponsUsed) {
		CouponsUsed = couponsUsed;
	}
}
