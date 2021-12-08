package com.greycampus.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.greycampus.entity.AustraliaState;
import com.greycampus.entity.Country;
import com.greycampus.entity.Customer;
import com.greycampus.entity.IndiaState;
import com.greycampus.service.CustomerService;

@Controller
@RequestMapping(path = "/save")
public class SaveController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String dispalyForm(Customer customer, Model model) {
		
		ArrayList<Country> countryList = customerService.getCountry();
		ArrayList<IndiaState> indiaStates = customerService.getIndiaStates();
		ArrayList<AustraliaState> australiaStates = customerService.getAustraliaStates();
		
		model.addAttribute("countryList", countryList);
		model.addAttribute("indiaList", indiaStates);
		model.addAttribute("australiaList", australiaStates);
		
		return "saveCustomer.jsp";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveForm(Customer customer, Model model) {
		
		model.addAttribute("customer", customer);
		
		customerService.save(customer);
		return "save.jsp";
		
		
		
	}

}
