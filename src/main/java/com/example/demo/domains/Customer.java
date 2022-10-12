package com.example.demo.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	@JoinColumn(name="customer_id",referencedColumnName="CUSTOMERID")
	private int customerID;
	@Column(name="CUSTOMERNAME")
	private String customerName;
	private String address;
	private String favres;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerID, String customerName, String address, String favres) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.address = address;
		this.favres = favres;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFavres() {
		return favres;
	}
	public void setFavres(String favres) {
		this.favres = favres;
	}
	
	
	
}
