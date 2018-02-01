package com.coupons.dba;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.coupons.entity.Coupons;

@RepositoryRestResource
@Transactional
public interface CouponJpa extends CrudRepository<Coupons,String>{

	Coupons findByCouponId(int id);
	List<Coupons> findAll();
	List<Coupons> findByCouponName(String query);
	Coupons save(Coupons coupon);
	Integer deleteByCouponId(int id);
}
