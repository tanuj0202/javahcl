package day16.Salary_Module.Main_module.src.com.main.app;

import com.salary.service.EmployeeSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        int monthCount = EmployeeSalary.getMonthCount();
        int[] salaries = new int[monthCount];
        int[] leaveDays = new int[monthCount];
        String employeeName;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter employee name: ");
            employeeName = scanner.nextLine().trim();
            if (employeeName.isEmpty()) {
                throw new IllegalArgumentException("Employee name cannot be empty.");
            }

            for (int i = 0; i < monthCount; i++) {
                String month = EmployeeSalary.getMonth(i);
                System.out.print("Enter salary for " + month + " (Rs.): ");
                salaries[i] = scanner.nextInt();
                if (salaries[i] < 0) {
                    throw new IllegalArgumentException("Salary cannot be negative.");
                }

                System.out.print(
                    "Enter leave days for " + month + " (0-" + EmployeeSalary.getDays(i) + "): "
                );
                leaveDays[i] = scanner.nextInt();
                if (leaveDays[i] < 0 || leaveDays[i] > EmployeeSalary.getDays(i)) {
                    throw new IllegalArgumentException(
                        "Leave days for " + month + " must be between 0 and "
                            + EmployeeSalary.getDays(i) + "."
                    );
                }
            }
        }

        EmployeeSalary employee = new EmployeeSalary(leaveDays);
        ExecutorService executor = Executors.newFixedThreadPool(monthCount);
        try {
            List<Future<Long>> futures = new ArrayList<>();

            for (int i = 0; i < monthCount; i++) {
                final int salary = salaries[i];
                final int days = EmployeeSalary.getDays(i);
                final int leave = employee.getLeaveDays(i);

                Callable<Long> task = () -> {
                    Thread.sleep(5000);
                    return (long) salary * (days - leave) / days;
                };

                futures.add(executor.submit(task));
            }

            long totalSalary = 0;
            long[] monthlySalaries = new long[monthCount];

            for (int i = 0; i < futures.size(); i++) {
                monthlySalaries[i] = futures.get(i).get();
                totalSalary += monthlySalaries[i];
            }

            System.out.println("\n===== YEARLY SALARY SUMMARY =====");
            System.out.println("Employee: " + employeeName);
            System.out.printf("Yearly salary: Rs. %,d%n", totalSalary);

            System.out.println("\n===== MONTHLY SALARY DETAILS =====");
            for (int i = 0; i < monthCount; i++) {
                System.out.printf(
                    "%s (%d Days): Rs. %,d%n",
                    EmployeeSalary.getMonth(i),
                    EmployeeSalary.getDays(i),
                    monthlySalaries[i]
                );
            }
        } finally {
            executor.shutdown();
        }
    }
}
