package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domains.Customer;

import com.example.demo.repos.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
private CustomerRepository repo;

public CustomerService() {
	super();
	// TODO Auto-generated constructor stub
}

public CustomerService(CustomerRepository repo) {
	super();
	this.repo = repo;
}

public CustomerRepository getRepo() {
	return repo;
}

public void setRepo(CustomerRepository repo) {
	this.repo = repo;
}
public List<Customer> findAll()
{
	return repo.findAll();
}
public Customer add(Customer C) {
	return repo.save(C);
}
}
