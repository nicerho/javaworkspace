package Multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("hoho"), new CallableTask("J"), new CallableTask("H"));
		List<Future<String>> results = executorService.invokeAll(tasks); //invokeAll 은 전부 다 실행되기를 기다린다..ㅣ.ㅣ
		
		for(Future<String> result:results){
			System.out.println(result.get());
		}
		executorService.shutdown();
	}
}
