package com.teja.objectoriented;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("Broadway", "tempe", "85282");

		Customer customer = new Customer("Teja", homeAddress);

		System.out.println(customer.toString());

	}

}
