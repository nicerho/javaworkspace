package oop3.inheritance;

public class Student extends Person {
	private String colleageName;

	public Student(String name, String colleageName) {
		super(name);
		this.colleageName = colleageName;

	}

	private String CollegeName;
	private int year;

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
