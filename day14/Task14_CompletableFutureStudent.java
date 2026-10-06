package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task14_CompletableFutureStudent {
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            String name = sc.nextLine();
            students.add(new Student(i + 1, name));
        }

        System.out.print("Enter student ID to fetch (1-" + n + "): ");
        int fetchId = sc.nextInt();
        sc.close();

        ExecutorService executor = Executors.newSingleThreadExecutor();

        CompletableFuture<Student> fetchFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return students.stream().filter(s -> s.id == fetchId).findFirst().orElse(null);
        }, executor);

        CompletableFuture<String> processFuture = fetchFuture.thenApply(student -> {
            if (student == null) return "Student not found";
            return student.name.toUpperCase();
        });

        System.out.println("Main thread continues without blocking...");
        System.out.println("Fetching student details...");

        try {
            String result = processFuture.get();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}