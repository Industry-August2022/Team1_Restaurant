package com.example.demo.domains;
import java.util.Date;

public class Restaurant {
private int restaurantid;
private String RestName;
private Date OpenTime;
private Date CloseTime;
private String Address;
private long phoneno;
public Restaurant(int restaurantid, String restName, Date openTime, Date closeTime, String address, long phoneno) {
	super();
	this.restaurantid = restaurantid;
	RestName = restName;
	OpenTime = openTime;
	CloseTime = closeTime;
	Address = address;
	this.phoneno = phoneno;
}
public int getRestaurantid() {
	return restaurantid;
}
public void setRestaurantid(int restaurantid) {
	this.restaurantid = restaurantid;
}
public String getRestName() {
	return RestName;
}
public void setRestName(String restName) {
	RestName = restName;
}
public Date getOpenTime() {
	return OpenTime;
}
public void setOpenTime(Date openTime) {
	OpenTime = openTime;
}
public Date getCloseTime() {
	return CloseTime;
}
public void setCloseTime(Date closeTime) {
	CloseTime = closeTime;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}

}