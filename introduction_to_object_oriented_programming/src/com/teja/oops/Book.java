package com.teja.oops;

public class Book {

	void printBook(String bookName) {
		System.out.println(bookName);
	}

	private int noOfCopiesOfBook = 0;

	public int getNoOfCopiesOfBook() {
		return noOfCopiesOfBook;
	}

	public void setNoOfCopiesOfBook(int noOfCopiesOfBook) {
		if (noOfCopiesOfBook > 0) {
			this.noOfCopiesOfBook = noOfCopiesOfBook;
		}
	}

	public void increaseNoOfCopies(int increaseBy) {
		setNoOfCopiesOfBook(this.noOfCopiesOfBook + increaseBy);
	}

	public void decreaseNoOfCopies(int decreaseBy) {
		setNoOfCopiesOfBook(this.noOfCopiesOfBook - decreaseBy);
	}

}
