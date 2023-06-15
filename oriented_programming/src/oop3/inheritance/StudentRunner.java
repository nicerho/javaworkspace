package oop3.inheritance;

public class StudentRunner {
	public static void main(String[] args) {
		// Student student = new Student();
		// student.setName("ho");
		// student.setEmail("asdfsf@sdf.com");
		/*
		 * Person person = new Person(); String value = person.toString();
		 * person.setEmail("aklsdjf@sdklf.com"); person.setName("hoho");
		 * person.setPhonenumber("123-456-789"); System.out.println(value);
		 * System.out.println(person);
		 */
		Employee employee = new Employee("ho", "boss");
		employee.setEmail("aklsdjf@sdklf.com");
		// employee.setName("hoho");
		employee.setPhonenumber("123-456-789");
		employee.setEmployeeGrade('A');
		employee.setTitle("wh");
		System.out.println(employee);
	}
}
