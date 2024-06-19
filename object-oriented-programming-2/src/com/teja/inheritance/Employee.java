package com.teja.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

	Employee(String name) {
		super(name);
	}

	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format(
				"Employer Name: %s, Title: %s, Employee Grade:%s, salary:%s, name: %s, phone: %s, email: %s",
				employerName, title, employeeGrade, salary, super.getName(), this.getPhoneNumber(), this.getEmail());
	}
}
