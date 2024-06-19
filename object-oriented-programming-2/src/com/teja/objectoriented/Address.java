package com.teja.objectoriented;

public class Address {

	private String line1;
	private String city;
	private String zipcode;

	public Address(String line1, String city, String zipcode) {
		this.line1 = line1;
		this.city = city;
		this.zipcode = zipcode;

	}

	@Override
	public String toString() {
		return "line1: " + line1 + " city: " + city + " zipcode: " + zipcode;
	}

}
