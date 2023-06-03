package books;

public class BookRunner {

	public static void main(String[] args) {
		Book cleanCode = new Book(1000);
		System.out.println(cleanCode.getNoOfCopies());
		cleanCode.increaseNoOfCopies(1000);
		cleanCode.decreaseNoOfCopies(1000);
		System.out.println(cleanCode.getNoOfCopies());
	}

}
