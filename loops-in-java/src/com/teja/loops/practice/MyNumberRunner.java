package com.teja.loops.practice;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(1);
		System.out.println("is Prime:" + number.isPrime());
		System.out.println("Sum of Numbers Up to N:" + number.sumUptoN());
		System.out.println("Sum Of Divisiors of N:" + number.sumOfDivisors());
		number.printANumberTriangle();

	}

}
