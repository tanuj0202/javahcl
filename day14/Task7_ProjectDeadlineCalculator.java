package day14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7_ProjectDeadlineCalculator {
    static class Project {
        String name;
        LocalDate startDate;
        int weeks;

        Project(String name, LocalDate startDate, int weeks) {
            this.name = name;
            this.startDate = startDate;
            this.weeks = weeks;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Project> projects = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter number of projects: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter project " + (i + 1) + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter start date (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate startDate = LocalDate.parse(dateStr, formatter);
            System.out.print("Enter duration in weeks: ");
            int weeks = sc.nextInt();
            sc.nextLine();
            projects.add(new Project(name, startDate, weeks));
        }

        System.out.println("\n--- Project Deadlines ---");
        LocalDate today = LocalDate.now();
        for (Project p : projects) {
            LocalDate deadline = p.startDate.plusWeeks(p.weeks);
            long daysRemaining = ChronoUnit.DAYS.between(today, deadline);
            System.out.println("Project: " + p.name);
            System.out.println("  Start Date: " + p.startDate.format(formatter));
            System.out.println("  Duration: " + p.weeks + " weeks");
            System.out.println("  Deadline: " + deadline.format(formatter));
            System.out.println("  Days Remaining: " + (daysRemaining >= 0 ? daysRemaining : "Deadline passed"));
            System.out.println();
        }
        sc.close();
    }
}