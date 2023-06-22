package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	ReentrantLock lockForI = new ReentrantLock();
	ReentrantLock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock();// Get Lock For I
		i++;
		lockForI.unlock();
		// Realease Lock For I

	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		lockForJ.lock();// Get Lock For J
		j++;
		lockForJ.unlock();
		// Release Lock For J

	}

	public int getJ() {
		return j;
	}
}
