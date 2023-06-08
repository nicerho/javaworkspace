package star;

public class Star {
	public int number;

	public Star(int number) {
		this.number = number;
	}

	public void echawon() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");

			}
			System.out.println();

		}
	}
}
