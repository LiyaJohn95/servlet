package com.spring4.Spring_autowiring1;

public class Address {
	
	String street;
	String city;
	String state;
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
	
	public void myAddress() {
		System.out.println("street is : " + street);
		System.out.println("city is : " + city);
		System.out.println("state is : " + state);
		
	}

}
