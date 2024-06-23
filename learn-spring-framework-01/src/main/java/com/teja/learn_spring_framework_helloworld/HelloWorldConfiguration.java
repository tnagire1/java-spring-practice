package com.teja.learn_spring_framework_helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {

}

record Address(String city, String state, String zipCode) {

}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String getName()

	{
		return "Teja";
	}

	@Bean
	public int age()

	{
		return 26;
	}

	@Bean

	public Person person1() {
		return new Person("Teja", 26, new Address("Tempe-Hardcoded", "AZ", "85281"));
	}

	@Bean
	public Person person2() {
		return new Person(getName(), age(), addressMethodCall());
	}

	@Bean
	public Person person3(String getName, int age, Address address3) {
		return new Person(getName, age, address3);
	}

	@Bean
	public Person person4(String getName, int age, @Qualifier("Qualifier") Address address3) {
		return new Person(getName, age, address3);
	}

	@Bean(name = "address1")
	@Primary
	public Address address() {
		return new Address("Tempe", "AZ", "85281");
	}

	@Bean(name = "address2")
	public Address addressMethodCall() {
		return new Address("Tempe-MethodCall", "AZ", "85281");
	}

	@Bean(name = "address3")
	@Qualifier("Qualifier")
	public Address addressParameters() {
		return new Address("Tempe-Parameters", "AZ", "85281");
	}

}
