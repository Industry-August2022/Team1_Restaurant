package com.example.demo.domains;

public class Admin extends Customer {

	private int customerId;
	private String name;
	private String address;
	private String email;
	private String password;
	
	public Admin(int customerId, String name, String address, String email, String password) {
		super(name, address);
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}