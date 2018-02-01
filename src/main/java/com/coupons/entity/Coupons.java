package com.coupons.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"category", "store", "couponDetails","user"})
@Entity
public class Coupons {

	@Id
	private int couponId;
	
	private String couponName;
	
	private String CouponCode;
	
	private String CouponImage;
	
	private String IncludedOffers;
	
	private int Discount;
	
	private  Date UploadedTime;
	
	private Date ValidityTime;
	
	private Date LastUsed;
	
	@OneToOne
	private CouponUsage couponUsage;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Categories category;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Stores store;
	
	@OneToOne(fetch=FetchType.LAZY)
	private User user;

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponCode() {
		return CouponCode;
	}

	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public Stores getStore() {
		return store;
	}

	public void setStore(Stores store) {
		this.store = store;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	public String getCouponImage() {
		return CouponImage;
	}

	public void setCouponImage(String couponImage) {
		CouponImage = couponImage;
	}

	public String getIncludedOffers() {
		return IncludedOffers;
	}

	public void setIncludedOffers(String includedOffers) {
		IncludedOffers = includedOffers;
	}

	public int getDiscount() {
		return Discount;
	}

	public void setDiscount(int discount) {
		Discount = discount;
	}

	public Date getUploadedTime() {
		return UploadedTime;
	}

	public void setUploadedTime(Date uploadedTime) {
		UploadedTime = uploadedTime;
	}

	public Date getValidityTime() {
		return ValidityTime;
	}

	public void setValidityTime(Date validityTime) {
		ValidityTime = validityTime;
	}

	public Date getLastUsed() {
		return LastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		LastUsed = lastUsed;
	}

	public CouponUsage getCouponUsage() {
		return couponUsage;
	}

	public void setCouponUsage(CouponUsage couponUsage) {
		this.couponUsage = couponUsage;
	}



	
	
}
