package day15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task {
    public static void main(String[] args) throws Exception {
        // 1. Create a program using Callable<Integer> to calculate an employee's annual salary from a monthly salary. Submit the task to an ExecutorService, obtain the result using Future.get(), and display the annual salary.

        int monthlySalary = 50000;

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            return monthlySalary * 12;
        };

        Future<Integer> future = executor.submit(task);

        int annualSalary = future.get();

        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + annualSalary);

        executor.shutdown();

        //2. Given three groups of student marks, create a Callable task for each group to calculate its average. Submit all tasks to an ExecutorService and use Future objects to retrieve and display the three averages.
        ExecutorService executor2 = Executors.newFixedThreadPool(3);

        int[] group1 = {80, 75, 90, 85};
        int[] group2 = {70, 65, 80, 75};
        int[] group3 = {90, 95, 85, 88};

        Callable<Double> task1 = () -> {
            int sum = 0;
            for (int marks : group1) {
                sum += marks;
            }
            return (double) sum / group1.length;
        };

        Callable<Double> task2 = () -> {
            int sum = 0;
            for (int marks : group2) {
                sum += marks;
            }
            return (double) sum / group2.length;
        };

        Callable<Double> task3 = () -> {
            int sum = 0;
            for (int marks : group3) {
                sum += marks;
            }
            return (double) sum / group3.length;
        };

        Future<Double> f1 = executor2.submit(task1);
        Future<Double> f2 = executor2.submit(task2);
        Future<Double> f3 = executor2.submit(task3);

        System.out.println("Group 1 Average: " + f1.get());
        System.out.println("Group 2 Average: " + f2.get());
        System.out.println("Group 3 Average: " + f3.get());

        executor2.shutdown();

        // 3. Create a Runnable that simulates processing an employee record for 3 seconds. Submit it using submit(Runnable, result) with the predefined result "Employee Processed Successfully". Use Future.get() to display the result after task completion.

         ExecutorService executor3 = Executors.newSingleThreadExecutor();

        Runnable task5 = () -> {
            try {
                System.out.println("Processing employee record...");
                Thread.sleep(3000);
                System.out.println("Employee processing completed.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Future<String> future2 = executor3.submit(task5, "Employee Processed Successfully");

        String result = future2.get();

        System.out.println("Result: " + result);

        executor.shutdown();
    }
}
