package arraytest1;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {
		int[] marks = { 97, 98, 100 };
		Student student = new Student("Ho", marks);

		int number = student.getNumberOfMarks();
		System.out.println(number);
		int sum = student.getTotalSumOfMarks();
		System.out.println(sum);
		int maximumMark = student.getMaximumMark();
		System.out.println(maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println(minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println(average);
	}
}
