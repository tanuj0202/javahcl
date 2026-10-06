package day14;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4_EmployeeAgeCalculator {
    static class Employee {
        String name;
        LocalDate dob;

        Employee(String name, LocalDate dob) {
            this.name = name;
            this.dob = dob;
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
            System.out.print("Enter date of birth (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate dob = LocalDate.parse(dateStr, formatter);
            employees.add(new Employee(name, dob));
        }

        System.out.println("\n--- Employee Age Details ---");
        LocalDate today = LocalDate.now();
        for (Employee emp : employees) {
            Period age = Period.between(emp.dob, today);
            System.out.println(emp.name + " | DOB: " + emp.dob.format(formatter) +
                    " | Age: " + age.getYears() + " years, " +
                    age.getMonths() + " months, " + age.getDays() + " days");
        }
        sc.close();
    }
}