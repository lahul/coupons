package com.coupons.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stores {

	@Id
	private int StoreId;

	private String StoreName;
	
	private String StoreImage;
	
	@OneToOne
	private Rating rating;

	public int getStoreId() {
		return StoreId;
	}

	public void setStoreId(int storeId) {
		StoreId = storeId;
	}

	public String getStoreName() {
		return StoreName;
	}

	public void setStoreName(String storeName) {
		StoreName = storeName;
	}

	public String getStoreImage() {
		return StoreImage;
	}

	public void setStoreImage(String storeImage) {
		StoreImage = storeImage;
	}
	
	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
}
