package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task15_CompletableFutureDataProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        System.out.print("Enter integers separated by space: ");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        sc.close();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<Integer> sumFuture = CompletableFuture.supplyAsync(() -> {
            return numbers.stream().mapToInt(Integer::intValue).sum();
        }, executor);

        CompletableFuture<Integer> maxFuture = CompletableFuture.supplyAsync(() -> {
            return numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        }, executor);

        CompletableFuture<Double> avgFuture = CompletableFuture.supplyAsync(() -> {
            return numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        }, executor);

        System.out.println("Main thread continues without blocking...");
        System.out.println("Processing...");

        CompletableFuture<Void> combined = CompletableFuture.allOf(sumFuture, maxFuture, avgFuture);

        try {
            combined.get();
            System.out.println("\n--- Results ---");
            System.out.println("Sum: " + sumFuture.get());
            System.out.println("Max: " + maxFuture.get());
            System.out.println("Average: " + String.format("%.2f", avgFuture.get()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}