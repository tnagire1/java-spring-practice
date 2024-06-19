package com.teja.inheritance;

import java.math.BigDecimal;

public class EmployeePersonRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("Ranga");

		employee.setEmail("in28minutes@gmail.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setTitle("Programmer Analyst");
		employee.setEmployerName("In28Minutes");
		employee.setEmployeeGrade('A');
		employee.setSalary(new BigDecimal("50000"));
		System.out.println(employee);

	}

}
