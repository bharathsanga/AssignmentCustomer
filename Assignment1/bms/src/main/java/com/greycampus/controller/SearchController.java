package com.greycampus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.greycampus.entity.Customer;
import com.greycampus.service.CustomerService;

@Controller
@RequestMapping(path = "/search")
public class SearchController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String dispalyForm(Customer customer) {
		
		return "searchCustomer.jsp";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView saveForm(Customer customer) {
		
		List<Customer> list = customerService.search(customer);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("search.jsp");
		modelAndView.addObject("cust", list);
		return modelAndView;
		
		
		
	}
}
