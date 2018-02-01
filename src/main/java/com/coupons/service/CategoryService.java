package com.coupons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coupons.dba.CategoryJpa;
import com.coupons.entity.Categories;

@Service
public class CategoryService {

	@Autowired
	CategoryJpa categoryJpa;
	
	public List<Categories> findAll(){
		return categoryJpa.findAll();
	}
	
	public Categories save(Categories category){
		return categoryJpa.save(category);
	}
	
	public Categories edit(Categories category) {
		Categories c=categoryJpa.findByCategoryId(category.getCategoryId());
		c.setCategoryName(category.getCategoryName());
		return categoryJpa.save(c);
	}
	
	public Integer remove(Categories category) {
		return categoryJpa.removeByCategoryId(category);
	}
}
