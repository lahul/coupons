package com.coupons.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {

	@Id
	private int categoryId;
	
	private String CategoryName;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	
}
