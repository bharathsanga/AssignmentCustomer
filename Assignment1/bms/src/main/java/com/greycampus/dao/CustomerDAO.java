package com.greycampus.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greycampus.entity.AustraliaState;
import com.greycampus.entity.Country;
import com.greycampus.entity.Customer;
import com.greycampus.entity.IndiaState;
import com.greycampus.repository.AustraliaStateRepo;
import com.greycampus.repository.CountryRepo;
import com.greycampus.repository.CustomerRepo;
import com.greycampus.repository.IndiaStateRepo;

@Repository
public class CustomerDAO {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public void save(Customer customer) {
		customerRepo.save(customer);
	}
	
	public void update(Customer customer) {
		customerRepo.save(customer);
	}
	public void delete(Customer customer) {
		customerRepo.delete(customer);
	}
	
	public List<Customer> fetchbycid(Customer customer) {
		 Customer customer2 = customerRepo.findById(customer.getCid()).get();
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(customer2);
		return list;
	}
	
	public List<Customer> fetchbyname(Customer customer){
		List<Customer> list = customerRepo.findByName(customer.getName());
		return list;
		
	}
	
	public List<Customer> fetchbycidandname(Customer customer){
		List<Customer> list = customerRepo.findByCidAndName(customer.getCid(), customer.getName());
		return list;
	}
	public List<Customer> fetchall(){
		Iterable<Customer> list = customerRepo.findAll();
		return (List<Customer>)list;
	}
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private AustraliaStateRepo australiaStateRepo;
	
	@Autowired
	private IndiaStateRepo indiaStateRepo;
	
	
	
	public ArrayList<Country> getCountry() {
		ArrayList<Country> employeeList = countryRepo.findAll();
		return employeeList;
	}
	
	
	public ArrayList<AustraliaState> getAustraliaStates() {
		return australiaStateRepo.findAll();
	}
	
	public ArrayList<IndiaState> getIndiaStates() {
		return indiaStateRepo.findAll();
	}

	

}
