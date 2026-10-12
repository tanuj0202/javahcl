package day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i = 1; i <= 6; i++) {
			int taskNumber = i;
			
			executor.submit(()->{
				System.out.println("Task " + taskNumber + "started by " + Thread.currentThread().getName());
			});
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
			
			System.out.println("Task " + taskNumber + "completed by " + Thread.currentThread().getName());
		});
		}
		
		executor.shutdown();
	}
}
