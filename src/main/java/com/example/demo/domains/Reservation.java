package com.example.demo.domains;

import java.util.Date;

public class Reservation {

	private String Address;
	private Date Time;
	private int PartyAmount;
	public Reservation(String address, Date time, int partyAmount) {
		super();
		Address = address;
		Time = time;
		PartyAmount = partyAmount;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getTime() {
		return Time;
	}
	public void setTime(Date time) {
		Time = time;
	}
	public int getPartyAmount() {
		return PartyAmount;
	}
	public void setPartyAmount(int partyAmount) {
		PartyAmount = partyAmount;
	}
	
	
}
