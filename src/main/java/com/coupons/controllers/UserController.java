package com.coupons.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coupons.entity.User;
import com.coupons.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("users")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> register(@PathVariable int id) {
		User user=userService.getUser(id);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Integer> register(@Valid @RequestBody User user) {
		Integer id=userService.save(user);
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
	
	
	@PostMapping("/login")
	public Integer login(@RequestBody User user) {
		Integer id=userService.findByUserName(user.getUserName(),user.getPassword());
		return id;
	}
	
	@GetMapping("/removeuser/{id}")
	public User removeUser(@PathVariable int id) {
		return userService.removeUser(id);
	}
	
	/*
	@RequestMapping("/register")
	public ResponseEntity<List<User>> register() {
		List<User> list=userService.findall();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}*/
}
