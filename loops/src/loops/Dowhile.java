package loops;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		Dowhile dw = new Dowhile();
		dw.performOperationingUsingNestedIfElse();
	}

	static Scanner scanner = new Scanner(System.in);
	private static void performOperationingUsingNestedIfElse() {
		int choice1 = 0;
		int num1 = 0;
		int num2 = 0;
		do {
		System.out.println("Enter Number1 :");
		num1 = scanner.nextInt();
		System.out.println("Enter Number2 :");
		num2 = scanner.nextInt();
		System.out.println("Choices Available are");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - multiply");
		System.out.println("4 - divide");
		System.out.println("5 - Exit");
		System.out.println("Enter Choice");
		choice1 = scanner.nextInt();
		System.out.println("Your Choices are");
		System.out.println("Number1  " + num1);
		System.out.println("Number2  " + num2);
		System.out.println("Your Choice : " + choice1);
		if (choice1 == 1) {
			System.out.println("Result : " + (num1 + num2));
		} else if (choice1 == 2) {
			System.out.println("Result : " + (num1 - num2));

		} else if (choice1 == 3) {
			System.out.println("Result : " + (num1 * num2));
		} else if (choice1 == 4) {
			System.out.println("Result : " + (num1 / num2));
		} else if (choice1 == 5) {
			System.out.println("Good bye");
			break;
		} else {
			System.out.println("Invalid Operation");
		}
	} while (true);

}
}
