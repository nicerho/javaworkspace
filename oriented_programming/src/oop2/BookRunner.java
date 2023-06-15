package oop2;



public class BookRunner {
	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming with Java", "Ho");

		book.addReview(new Review(10, "good", 5));
		System.out.println(book);
	}
}
