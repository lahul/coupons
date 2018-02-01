package com.coupons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coupons.dba.CouponJpa;
import com.coupons.entity.Coupons;
import com.coupons.entity.User;

@Service
public class CouponService {

	@Autowired
	public CouponJpa couponJpa;
	
	public List findAll() {
		return couponJpa.findAll();
	}
	
	public List<Coupons> search(String couponName){
		return couponJpa.findByCouponName(couponName);
	}
	
	public Coupons findById(int id) {
		return couponJpa.findByCouponId(id);
	}
	
	public Coupons addCoupon(Coupons coupon) {
		return couponJpa.save(coupon);
	}
	
	
	public Coupons editCoupon(Coupons coupon) {
		return couponJpa.save(coupon);
	}
	
	public Integer removeCoupon(int id) {
		return couponJpa.deleteByCouponId(id);
	}
}
