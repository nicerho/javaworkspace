package ifstatementexamples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1 :");
		int number1 = scanner.nextInt();
		System.out.println("Enter Number2 :");
		int number2 = scanner.nextInt();
		System.out.println("Choices Available are");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - multiply");
		System.out.println("4 - divide2");
		System.out.println("Enter Choice");
		int choice = scanner.nextInt();
		System.out.println("Your Choices are");
		System.out.println("Number1  " + number1);
		System.out.println("Number2  " + number2);
		System.out.println("Choice" + choice);
	}
}
