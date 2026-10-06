package day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentExecutor {
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i <= 5; i++) {
			int taskId = i;
			executor.execute(() -> {
				System.out.println("Task " + taskId + " is performed by " + Thread.currentThread());
			});
			
		}
		//Future: 
		Future<Integer> f1 = executor.submit(() -> {
			try {
				System.out.println("Task Started...");
				Thread.sleep(10000);
				System.out.println("Task Completed...");
			} catch (Exception e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
				System.out.println("Task interrupted");
			}
			
			return 10;
		});
		
		System.out.println("Waiting for result...");
		System.out.println("Result: " + f1.get());
		
		executor.shutdown();
	}
}
