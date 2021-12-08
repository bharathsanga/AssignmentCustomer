package com.greycampus.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greycampus.dao.CustomerDAO;
import com.greycampus.entity.AustraliaState;
import com.greycampus.entity.Country;
import com.greycampus.entity.Customer;
import com.greycampus.entity.IndiaState;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	public void save(Customer customer) {
		customerDAO.save(customer);
	}
	
	@Transactional
	public void update(Customer customer) {
		customerDAO.update(customer);
	}
	
	@Transactional
	public void delete(Customer customer) {
		customerDAO.delete(customer);
	}
	
	@Transactional
	public List<Customer> search(Customer customer){
		if(customer.getCid() != null && customer.getName() != null && !customer.getName().isBlank()) {
			List<Customer> list = customerDAO.fetchbycidandname(customer);
			return list;
		}else if(customer.getCid() != null){
			List<Customer> list = customerDAO.fetchbycid(customer);
			return list;
		}else if(customer.getName() != null && !customer.getName().isBlank()) {
			List<Customer> list = customerDAO.fetchbyname(customer);
			return list;
		}else {
			List<Customer> list = customerDAO.fetchall();
			return list;
		}
		
	}
	
	@Transactional
	public ArrayList<Country> getCountry() {
		return customerDAO.getCountry();

	}
	
	@Transactional
	public ArrayList<AustraliaState> getAustraliaStates() {
		return customerDAO.getAustraliaStates();
	}
	
	@Transactional
	public ArrayList<IndiaState> getIndiaStates() {
		return customerDAO.getIndiaStates();
	}
	

}
