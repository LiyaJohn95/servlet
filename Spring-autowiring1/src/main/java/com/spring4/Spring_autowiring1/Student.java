package com.spring4.Spring_autowiring1;

public class Student {

	String firstName;
	String secondName;
	Address address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void details() {
		System.out.println("First Name  is : " +  firstName);
		System.out.println("Second Name  is : " + secondName);
		address.myAddress();
		
		
	}
}
