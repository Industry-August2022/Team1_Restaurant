package com.example.demo.domains;

public class RegisteredCustomer extends Customer{
	private int customerId;
	private String password;
	private String email;
	private String favRestaurant;
	public RegisteredCustomer(int customerId, String name, String password, String email, String address) {
		super(name, address);
		this.customerId = customerId;
		this.password = password;
		this.email = email;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFavRestaurant() {
		return favRestaurant;
	}
	public void setFavRestaurant(String favRestaurant) {
		this.favRestaurant = favRestaurant;
	}

}