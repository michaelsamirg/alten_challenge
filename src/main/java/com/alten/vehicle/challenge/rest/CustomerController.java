package com.alten.vehicle.challenge.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alten.vehicle.challenge.dao.CustomerRepository;
import com.alten.vehicle.challenge.model.Customer;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/list")
	@ResponseBody
	public List<Customer> listCustome()
	{
		List<Customer> list = new ArrayList<Customer>();

		try {
			list = customerRepository.findAll();
		} catch (Exception e) {
			list = new ArrayList<Customer>();
		}
		
		return list;
	}
}
