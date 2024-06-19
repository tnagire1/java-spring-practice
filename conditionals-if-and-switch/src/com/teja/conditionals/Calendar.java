package com.teja.conditionals;

public class Calendar {

	public static void main(String[] args) {

		System.out.println(isWeekDay(6));
		System.out.println(determineNameOfMonth(5));
		System.out.println(determineNameOfDay(5));

	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5: {
			/// System.out.println("The Givenday is a week day");
			return true;

		}
		case 0:
		case 6: {
			// System.out.println("The Givenday is not a week day");
			return false;
		}
		default: {
			// System.out.println("Enter a valid day number");
			return false;
		}

		}
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1: {
			return "January";
		}
		case 2: {
			return "Febuary";
		}
		case 3: {
			return "March";
		}
		case 4: {
			return "April";
		}
		case 5: {
			return "May";
		}
		case 6: {
			return "June";
		}
		case 7: {
			return "July";
		}
		case 8: {
			return "August";
		}
		case 9: {
			return "September";
		}
		case 10: {
			return "October";
		}
		case 11: {
			return "November";
		}
		case 12: {
			return "Decmber";
		}
		default: {
			return "Enter Valid Month Number";
		}

		}
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 1: {
			return "Monday";
		}
		case 2: {
			return "Tuesday";
		}
		case 3: {
			return "Wednesday";
		}
		case 4: {
			return "Thursday";
		}
		case 5: {
			return "Friday";
		}
		case 6: {
			return "Saturday";
		}
		case 0: {
			return "Sunday";
		}
		default: {
			return "Enter Valida Day Number";
		}
		}

	}

}
