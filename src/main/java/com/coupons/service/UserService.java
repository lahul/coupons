package com.coupons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coupons.dba.UserJpa;
import com.coupons.entity.User;

@Service
public class UserService {
	
	@Autowired
	public UserJpa userJpa;
	
	public List<User> getUsers(){
		return userJpa.findAll();
	}
	
	public Integer save(User user) {
		User u=userJpa.save(user);
		return u.getId();
	}
	
	public User getUser(int id) {
		User user=userJpa.findById(id);
		return user;
	}
	
	public Integer findByUserName(String userName,String password) {
		User user=userJpa.findByUserName(userName);
		if(user!=null) {
			String pass=user.getPassword();
				if(pass.equals(password))
					return user.getId();
				else
					return -1;
		}
		else
			return -1;
	}
	
	public User removeUser(int id) {
		return userJpa.deleteById(id);
	}
	
}
