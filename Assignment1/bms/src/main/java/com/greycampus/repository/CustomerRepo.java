package com.greycampus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{
	

	public List<Customer> findByCidAndName(Integer eid,String name);
	
	public List<Customer> findByCid(Integer eid);
	
	public List<Customer> findByName(String name);
	
	
}
