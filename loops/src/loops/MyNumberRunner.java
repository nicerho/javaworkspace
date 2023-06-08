package loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
		int sum = number.sumUptoN(4);
		System.out.println("sumUptoN " + sum);
		int sumOfDivisors = number.sumOfDivisors(6);
		System.out.println("sumOfDivisors " + sumOfDivisors);
		number.printNumberTriangle();
	}

}
