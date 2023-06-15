package arraytest1;

import java.math.BigDecimal;

public class Student2Runner {
	public static void main(String[] args) {
		int[] marks = { 97, 98, 100 };
		// Student2 클래스에 배열을 가변인수로 변경, 각기 다른 길이의 배열을 입력해도 ok
		// 가변인수는 매개변수에서 마지막 자리에 있어야한다
		// void a(int... value,String name){} <- 에러
		// void a (String name,int... value){} <- 굿
		Student2 student = new Student2("Ho", 97, 98, 99);
		Student2 student2 = new Student2("J", 98, 99);
		Student2 student3 = new Student2("JJ", 98, 99, 100, 10);

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
