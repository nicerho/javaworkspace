package oop2;

public class Review {
	private String description;
	private int rating;
	private int id;

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Review(int id, String description, int rating) {
		this.description = description;
		this.rating = rating;
		this.id = id;
	}

	public void addReview(Review review) {

	}

	@Override
	public String toString() {
		return String.format("rating - %s description - %s", rating, description);
	}
}
