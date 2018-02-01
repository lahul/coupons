package com.coupons.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;

import com.coupons.entity.Coupons;

import com.coupons.service.CouponService;

@Controller
public class CouponController {

	@Autowired
	CouponService couponService;

	@RequestMapping("/")
	public String home(){
		return "index";
	}


	@GetMapping("/coupons")
	public String CouponList() {
		return "coupons";
	}
	
	@PostMapping("/search")
	public List<Coupons> search(@RequestBody HashMap<String,String> hm){
		List<Coupons> list=couponService.search(hm.get("search"));
		return list;
	}
	
	/*@GetMapping("/coupon/{id}")
	public Coupons findById(@PathVariable int id){
		Coupons coupon=couponService.findById(id);
		if(coupon==null)
			throw new UserNotFoundException("No user found for "+id);
		return coupon;
	}*/
	
	@PostMapping("/addcoupon")
	public ResponseEntity<Object> addcoupon(@RequestBody Coupons coupon) {
		Coupons c=couponService.addCoupon(coupon);
		URI location=ServletUriComponentsBuilder.fromPath("/")
				.path("/coupon/{id}")
				.buildAndExpand(c.getCouponId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PostMapping("/editcoupon")
	public Coupons editCoupon(@RequestBody Coupons coupon) {
		return couponService.editCoupon(coupon);
	}

	@DeleteMapping("/removecoupon")
	public Integer removeCoupon(@RequestBody Coupons coupon) {
		return couponService.removeCoupon(coupon.getCouponId());
	}
}
