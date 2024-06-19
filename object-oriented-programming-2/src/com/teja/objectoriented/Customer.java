package com.teja.objectoriented;

public class Customer {

	private String name;
	private Address address;

	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Address: " + address;
	}

}
