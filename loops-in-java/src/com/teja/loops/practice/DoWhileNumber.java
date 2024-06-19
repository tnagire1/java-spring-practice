package com.teja.loops.practice;

import java.util.Scanner;

public class DoWhileNumber {

	public void cubeOfNumbers() {
		Scanner scanner = new Scanner(System.in);
		int number;

		do {
			System.out.print("Enter a Number:  ");
			number = scanner.nextInt();
			if (number > 0) {
				System.out.println("Cube is " + number * number * number);
			}

		} while (number > 0);

		System.out.println("Thank You! Have Fun!");
		scanner.close();
	}

}
