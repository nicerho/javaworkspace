package loops;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	// For limit = 30, output would be 1 4 9 16 25
	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i <= limit) {
			System.out.print(i * i + " ");
			i++;
		}
	}

	// for limit = 30, output would be 1 8 27
	public void printCubesUptoLimit() {
		int i = 1;
		System.out.println();
		while (i * i * i <= limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

}
