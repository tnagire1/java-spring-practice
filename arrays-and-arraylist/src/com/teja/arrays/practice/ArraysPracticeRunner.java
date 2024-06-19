package com.teja.arrays.practice;

import java.math.BigDecimal;

public class ArraysPracticeRunner {

	public static void main(String[] args) {

		Student student = new Student("Teja", 100, 100, 80, 100, 85, 90, 1000);
		int number = student.getNumberOfmarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();

		System.out.println(number);
		System.out.println(sum);
		System.out.println(maximumMark);
		System.out.println(minimumMark);
		System.out.println(average);
		System.out.println(student.toString());

	}

}
