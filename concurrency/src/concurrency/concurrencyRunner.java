package concurrency;

public class concurrencyRunner {
	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.increment();
		System.out.println(counter.getI());
		
	}
}
