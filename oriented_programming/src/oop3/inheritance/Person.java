package oop3.inheritance;

public class Person extends Object {
	private String name;
	private String email;
	private String phoneNumber;


	public Person(String name) {
		System.out.println("Person 생성자");
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phoneNumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phoneNumber = phonenumber;
	}

	@Override
	public String toString() {
		return name + "#" + email + "#" + phoneNumber;
	}
}
