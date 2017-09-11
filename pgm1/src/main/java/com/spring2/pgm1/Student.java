package com.spring2.pgm1;

public class Student {
	String name;
	int rollno;
	Address add ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public void details() {
		System.out.println("name is : "+name);
		System.out.println("rollno is : "+rollno );
		add.myAddress();
	}

}
