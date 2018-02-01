package com.coupons.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coupons.entity.Categories;
import com.coupons.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories")
	public String categories(){
		return "categories";
	}
	
	@PostMapping("/addcategory")
	public Categories addcategory(@RequestBody Categories category) {
		return categoryService.save(category);
	}
	
	@PostMapping("/editcategory")
	public Categories editcategory(@RequestBody Categories category) {
		return categoryService.edit(category);
	}
	
	@PostMapping("/removecategory")
	public Integer removecategory(@RequestBody Categories category) {
		return categoryService.remove(category);
	}
}
