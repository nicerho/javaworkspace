package oop2;

import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAutuor(String author) {
		this.author = author;
	}

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		this.reviews.add(review);

	}

	@Override
	public String toString() {
		return String.format("id - %s name - %s author - %s Reviews =%s", id, name, author, reviews);
	}

}
