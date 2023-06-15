package oop1;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("line 1", "seoul", "12345");
		Customer customer = new Customer("ho", homeAddress);
		Address workAddress = new Address("line 1", "guro", "54321");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}
}
