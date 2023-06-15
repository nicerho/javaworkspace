package arraytest1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student3 {
	// 리팩토링을 통해 변경해도 출력값은 동일
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>(); // <- 리팩토링

	public Student3(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size(); // <- 리팩토링
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks); // <- 리팩토링
	}

	public int getMinimumMark() {
		return Collections.min(marks); // <- 리팩토링
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

		// return new BigDecimal(sum / number);
	}
}
