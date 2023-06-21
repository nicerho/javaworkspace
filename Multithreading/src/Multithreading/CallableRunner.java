package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		return " Hello " + name;
	}

}

public class CallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("hoho"));
		System.out.print("\n new CallableTask(\"hoho\") executed");
		String welcomeMessage = welcomeFuture.get();
		System.out.println("\n" + welcomeMessage);
		System.out.print(" Main completed");
	}
}
