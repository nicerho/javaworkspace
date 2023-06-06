package ifstatementexamples;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determineNameOfDay(8));
	}

	public static String determineNameOfDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			return "Tuesday";

		case 3:
			return "Wednesday";

		case 4:
			return "Thursday";

		case 5:
			return "Friday";

		case 6:
			result = "Saturday";
			break;
		default:
			result = "Invalid";
		}

		return result;
	}

}
