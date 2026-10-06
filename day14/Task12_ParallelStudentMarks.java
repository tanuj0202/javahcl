package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task12_ParallelStudentMarks {
    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    static class GroupAverageCalculator implements Callable<Double> {
        List<Student> students;
        String groupName;

        GroupAverageCalculator(String groupName, List<Student> students) {
            this.groupName = groupName;
            this.students = students;
        }

        @Override
        public Double call() {
            if (students.isEmpty()) return 0.0;
            int sum = 0;
            for (Student s : students) {
                sum += s.marks;
            }
            return (double) sum / students.size();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> allStudents = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();
            sc.nextLine();
            allStudents.add(new Student(name, marks));
        }

        System.out.print("Enter number of groups: ");
        int groups = sc.nextInt();
        sc.nextLine();

        int perGroup = (int) Math.ceil((double) allStudents.size() / groups);
        ExecutorService executor = Executors.newFixedThreadPool(groups);
        List<Future<Double>> futures = new ArrayList<>();

        for (int i = 0; i < groups; i++) {
            int start = i * perGroup;
            int end = Math.min(start + perGroup, allStudents.size());
            if (start >= allStudents.size()) break;

            List<Student> groupStudents = allStudents.subList(start, end);
            futures.add(executor.submit(new GroupAverageCalculator("Group " + (i + 1), groupStudents)));
        }

        System.out.println("\n--- Group Average Marks ---");
        for (int i = 0; i < futures.size(); i++) {
            try {
                double avg = futures.get(i).get();
                System.out.printf("Group %d Average: %.2f%n", i + 1, avg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        sc.close();
    }
}