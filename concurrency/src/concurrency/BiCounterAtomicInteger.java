package concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public void incrementI() {
		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public void incrementJ() {
		j.incrementAndGet();
	}

	public int getJ() {
		return j.get();
	}
}
