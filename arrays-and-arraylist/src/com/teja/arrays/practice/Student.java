package com.teja.arrays.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

	ArrayList<Integer> marks = new ArrayList<>();
	String name;

	public Student(String name, int... marks) {

		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfmarks() {

		return marks.size();
	}

	public int getTotalSumOfMarks() {

		int totalSum = 0;

		for (int mark : marks) {
			totalSum += mark;
		}

		return totalSum;
	}

	public int getMaximumMark() {
		int maxValue = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maxValue) {
				maxValue = mark;
			}
		}
		return maxValue;
	}

	public int getMinimumMark() {
		int minValue = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minValue) {
				minValue = mark;
			}
		}
		return minValue;
	}

	public BigDecimal getAverageMarks() {

		BigDecimal result = (new BigDecimal(this.getTotalSumOfMarks())).divide(new BigDecimal(marks.size()), 4,
				RoundingMode.UP);

		return result;

	}

	@Override
	public String toString() {
		return name + "  " + marks;

	}

}
