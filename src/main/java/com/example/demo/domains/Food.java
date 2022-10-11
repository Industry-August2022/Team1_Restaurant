package com.example.demo.domains;

import javax.persistence.Entity;


public class Food {
String Name;
float price;
int calories;
String Description;
public Food(String name, float price, int calories, String description) {
	super();
	Name = name;
	this.price = price;
	this.calories = calories;
	Description = description;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getCalories() {
	return calories;
}
public void setCalories(int calories) {
	this.calories = calories;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
	
	
}
