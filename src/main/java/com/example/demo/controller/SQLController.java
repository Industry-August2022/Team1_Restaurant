package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domains.Customer;
import com.example.service.CustomerService;


@RestController
public class SQLController {
	@Autowired
	private CustomerService service;


public SQLController(CustomerService service) {
		super();
		this.service = service;
		// TODO Auto-generated constructor stub
	}



public CustomerService getService() {
	return service;
}



public void setService(CustomerService service) {
	this.service = service;
}

@Override
public String toString() {
	return "CustomerController [customerService" + service + "]";
}


@GetMapping("/retrieve")
public List<Customer> getAllCategories()

{

    return service.findAll();

}



@PostMapping("/insert")
public Customer addCus(@RequestBody Customer cus)

{

    return service.add(cus);

}

	
	
}
