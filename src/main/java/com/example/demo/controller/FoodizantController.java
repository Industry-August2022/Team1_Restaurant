package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repos.CustomerRepository;

@Controller
public class FoodizantController {
//@Autowired
private CustomerRepository Repo;
	
	@GetMapping("/Home")
	public String welcome() {
		new ResponseEntity<>(HttpStatus.OK);
		
		return "WebPageHometest";
	}
	@GetMapping("/Finalize")
	public String checkout() {
		new ResponseEntity<>(HttpStatus.OK);
		
		return "Checkout";
	}
}
