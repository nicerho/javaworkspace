package concurrency;

public class Counter {
	int i ;
	synchronized public void increment() {
		i++;
		
	}
	public int getI() {
		return i;
	}
}
