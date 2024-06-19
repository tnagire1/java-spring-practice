package com.teja.fp;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 12, 14, 18, 19, 20, 35);
		sumOfFP(numbers);

	}

	static void sumOfNormal(List<Integer> l) {
		int sum = 0;
		for (Integer i : l) {
			sum += i;
		}
		System.out.println(sum);
	}

	static void sumOfFP(List<Integer> l) {
		int sum = 0;
		sum = l.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
		System.out.println(sum);
	}

}
