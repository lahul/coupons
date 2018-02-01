package com.coupons.dba;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.coupons.entity.Categories;

@RepositoryRestResource
public interface CategoryJpa extends CrudRepository<Categories,String>{

	List<Categories> findAll();
	Categories save(Categories category);
	Categories findByCategoryId(int CategoryId);
	Integer removeByCategoryId(Categories category);
}
