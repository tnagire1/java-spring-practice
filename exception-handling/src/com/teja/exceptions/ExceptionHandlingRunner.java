package com.teja.exceptions;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		method1();
		System.out.println("Main method ended.");

	}

	static void method1() {
		method2();
		System.out.println("Method1 Ended");

	}

	static void method2() {
		try {
			String str = null;
			str.length();
			System.out.println("Method1 Ended");
		} catch (NullPointerException e) {
			System.out.println("Matched with null pointer exception.");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Matched with array index out of bound exception.");
			e.printStackTrace();
		}

	}

}
