package day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(()->{
            System.out.println("Task 1 executed by: " + Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                Thread.currentThread().interrupt();
            }
        });
        
        executor.submit(()->{
            System.out.println("Task 2 executed by: " + Thread.currentThread().getName());
            System.out.println("Task 2 completed");
        });
        
        executor.submit(()->{
            System.out.println("Task 3 executed by: " + Thread.currentThread().getName());

            System.out.println("Task 3 completed");
        });
        executor.shutdown();
    }
}
