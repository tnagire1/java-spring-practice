package com.teja.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.printBook("Art Of Computer Programming");
		effectiveJava.printBook("Effective Java");
		cleanCode.printBook("Clean Code");
		artOfComputerProgramming.setNoOfCopiesOfBook(100);
		effectiveJava.setNoOfCopiesOfBook(15);
		cleanCode.setNoOfCopiesOfBook(-5);
		System.out.println(cleanCode.getNoOfCopiesOfBook());
		cleanCode.increaseNoOfCopies(1);
		System.out.println(cleanCode.getNoOfCopiesOfBook());
		// System.out.println(effectiveJava.getNoOfCopiesOfBook());

	}
}
