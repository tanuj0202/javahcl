package day14;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_EmployeeJoiningAnalysis {
    static class Employee {
        String name;
        LocalDate joiningDate;

        Employee(String name, LocalDate joiningDate) {
            this.name = name;
            this.joiningDate = joiningDate;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee " + (i + 1) + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter joining date (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate joining = LocalDate.parse(dateStr, formatter);
            employees.add(new Employee(name, joining));
        }

        System.out.println("\n--- Employee Service Analysis ---");
        for (Employee emp : employees) {
            Period service = Period.between(emp.joiningDate, LocalDate.now());
            System.out.println(emp.name + " | Joined: " + emp.joiningDate.format(formatter) +
                    " | Service: " + service.getYears() + " years, " +
                    service.getMonths() + " months, " + service.getDays() + " days");
        }
        sc.close();
    }
}