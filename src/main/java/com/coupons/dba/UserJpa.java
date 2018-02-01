package com.coupons.dba;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.coupons.entity.User;

@RepositoryRestResource
public interface UserJpa extends CrudRepository<User, String>{

	List<User> findAll();
	User save(User user);
	User findById(int Id);
	User deleteById(int id);
	User findByUserName(String userName);
}
