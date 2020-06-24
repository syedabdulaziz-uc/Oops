package com.Oopsagain2.zak;

public class Customer {
	private String name;
	private Address hmadd;
	private Address wrkadd;
	
	public Customer(String name,Address hmadd) {
		this.name=name;
		this.hmadd=hmadd;
	}

	public Address getHmadd() {
		return hmadd;
	}

	public void setHmadd(Address hmadd) {
		this.hmadd = hmadd;
	}

	public Address getWrkadd() {
		return wrkadd;
	}

	public void setWrkadd(Address wrkadd) {
		this.wrkadd = wrkadd;
	}
	public String toString() {
		return String.format("name-[%s] home address - [%s] work address - [%s]", name,hmadd, wrkadd );
	}
	
}
