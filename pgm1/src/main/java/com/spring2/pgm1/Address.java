package com.spring2.pgm1;

public class Address {
	
	String city;
	String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public void myAddress() {
		System.out.println("city is : "+city);
		System.out.println("state is : "+state);
	}

}
