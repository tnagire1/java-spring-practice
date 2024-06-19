package com.teja.conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		int number1, number2, operation;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1:");
		number1 = scanner.nextInt();
		System.out.print("Enter Number2:");
		number2 = scanner.nextInt();
		System.out.println("1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");
		System.out.print("Choose Operation:");
		operation = scanner.nextInt();
		scanner.close();
		System.out.println("Result - if - " + ifCaluclator(number1, number2, operation));

		System.out.println("Result - switch -  " + switchCaluclator(number1, number2, operation));

	}

	private static int switchCaluclator(int number1, int number2, int operation) {
		int result = 0;
		switch (operation) {
		case 1: {
			result = number1 + number2;
			break;
		}
		case 2: {
			result = number1 - number2;
			break;
		}
		case 3: {
			result = number1 / number2;
			break;
		}
		case 4: {
			result = number1 * number2;
			break;
		}
		default: {
			result = 0;
			System.out.println("Enter Correct Operation.");
		}
		}
		return result;
	}

	private static int ifCaluclator(int number1, int number2, int operation) {
		int result = 0;
		if (operation == 1) {
			result = number1 + number2;
		} else if (operation == 2) {
			result = number1 - number2;
		} else if (operation == 3) {
			result = number1 / number2;
		} else if (operation == 4)

		{
			result = number1 * number2;
		} else {
			result = 0;
			System.out.println("Enter Correct Operation.");
		}
		return result;
	}

}
