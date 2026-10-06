package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task11_CallableEmployeeSalary {
    static class Employee {
        String name;
        double monthlySalary;

        Employee(String name, double monthlySalary) {
            this.name = name;
            this.monthlySalary = monthlySalary;
        }
    }

    static class SalaryCalculator implements Callable<Double> {
        Employee emp;

        SalaryCalculator(Employee emp) {
            this.emp = emp;
        }

        @Override
        public Double call() {
            return emp.monthlySalary * 12;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee " + (i + 1) + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter monthly salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            employees.add(new Employee(name, salary));
        }

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Double>> futures = new ArrayList<>();

        for (Employee emp : employees) {
            futures.add(executor.submit(new SalaryCalculator(emp)));
        }

        System.out.println("\n--- Annual Salary Calculation ---");
        for (int i = 0; i < employees.size(); i++) {
            try {
                double annualSalary = futures.get(i).get();
                System.out.println(employees.get(i).name + " | Monthly: " + employees.get(i).monthlySalary +
                        " | Annual: " + annualSalary);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        sc.close();
    }
}