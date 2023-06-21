package Multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("hoho"), new CallableTask("J"), new CallableTask("H"));
		String results = executorService.invokeAny(tasks); //invokeAny는 셋 중 가장 빨리 실행되는 결과를 가져온다~
		System.out.println(results);
		executorService.shutdown();
	}
}
