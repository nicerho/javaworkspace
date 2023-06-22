package exception;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		Scanner 스캐너 = null;
		try {
			스캐너 = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5];

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			if (스캐너 != null) {
				스캐너.close();
			}
		}
		System.out.println("closing out main");
	}
}
