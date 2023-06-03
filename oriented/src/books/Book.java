package books;

public class Book {
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		// setNoOfCopies(noOfCopies);
	}
	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}

	public void increaseNoOfCopies(int howMuch) {
		// this.noOfCopies += howMuch;
		setNoOfCopies(this.noOfCopies + howMuch);

	}

	public void decreaseNoOfCopies(int howMuch) {
		this.noOfCopies -= howMuch;
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
