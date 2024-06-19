package com.teja.objectoriented;

import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {

		reviews.add(review);

	}

	@Override
	public String toString() {
		return String.format("id-[%d],name-[%s],author-[%s],\nreviews-%s", id, name, author, reviews);
	}

}
