
package com.teja.objectoriented;

public class BookReviewRunner {
	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming With Java", "Ranga");
		book.addReview(new Review(10, "Great Book", 4));
		book.addReview(new Review(101, "Awesome", 5));
		System.out.println(book);
	}
}
