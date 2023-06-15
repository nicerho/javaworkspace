package arraytest1;

public class StringRunner {
	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		// 가장 긴 요일은?
		String longDay = "";
		for (String day : daysOfWeek) {
			if (day.length() > longDay.length())
				longDay = day;
		}
		System.out.println(longDay);

		// 요일을 역순으로 출력
		for (int i = daysOfWeek.length - 1; i > 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}
}
