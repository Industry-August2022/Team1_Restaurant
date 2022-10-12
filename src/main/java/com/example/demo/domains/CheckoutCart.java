package com.example.demo.domains;

import java.util.*;

public class CheckoutCart {
private ArrayList<Food> food;
private ArrayList<Customers> CL;
public CheckoutCart(ArrayList<Food> food, ArrayList<Customers> cL) {
	super();
	this.food = food;
	CL = cL;
}
public ArrayList<Food> getFood() {
	return food;
}
public void setFood(ArrayList<Food> food) {
	this.food = food;
}
public ArrayList<Customers> getCL() {
	return CL;
}
public void setCL(ArrayList<Customers> cL) {
	CL = cL;
}
	
	
}
