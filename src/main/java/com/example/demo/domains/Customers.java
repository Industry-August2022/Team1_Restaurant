package com.example.demo.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="CUSTOMERS")
public class Customers {
	@Id
	@JoinColumn(name="customerid",referencedColumnName="CUSTOMERID")
	private int customerid;
	@Column(name="FAVRESTAURANT")
	private String favrestaurant;
	private String customername;
	private String street;
	private String city;
	private String state;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int categoryID, String favres, String customername, String street, String city, String state) {
		super();
		this.customerid = categoryID;
		this.favrestaurant = favres;
		this.customername = customername;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getCategoryID() {
		return customerid;
	}
	public void setCategoryID(int categoryID) {
		this.customerid = categoryID;
	}
	public String getFavres() {
		return favrestaurant;
	}
	public void setFavres(String favres) {
		this.favrestaurant = favres;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}