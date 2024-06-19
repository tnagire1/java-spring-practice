package com.teja.inheritance;

public class Person {
	private String email;
	private String name;
	private String phoneNumber;

	Person(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format("Email: %s,Name: %s,Phone_Number:%s", email, name, phoneNumber);
	}

}
