package com.coupons.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CouponUsage {

	@Id
	private int CouponUsageId;
	
	private int Success;
	
	private int failures;
	
	private int TotalUsers;

	public int getCouponUsageId() {
		return CouponUsageId;
	}

	public void setCouponUsageId(int couponUsageId) {
		CouponUsageId = couponUsageId;
	}

	public int getSuccess() {
		return Success;
	}

	public void setSuccess(int success) {
		Success = success;
	}

	public int getFailures() {
		return failures;
	}

	public void setFailures(int failures) {
		this.failures = failures;
	}

	public int getTotalUsers() {
		return TotalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		TotalUsers = totalUsers;
	}
	
	
}
