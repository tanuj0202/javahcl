package day14;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10_SubscriptionExpiryChecker {
    static class Subscription {
        String userName;
        LocalDate startDate;
        int durationMonths;

        Subscription(String userName, LocalDate startDate, int durationMonths) {
            this.userName = userName;
            this.startDate = startDate;
            this.durationMonths = durationMonths;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Subscription> subscriptions = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter number of subscriptions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter user name for subscription " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter start date (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate startDate = LocalDate.parse(dateStr, formatter);
            System.out.print("Enter duration in months: ");
            int months = sc.nextInt();
            sc.nextLine();
            subscriptions.add(new Subscription(name, startDate, months));
        }

        System.out.println("\n--- Subscription Status ---");
        LocalDate today = LocalDate.now();
        for (Subscription s : subscriptions) {
            LocalDate expiryDate = s.startDate.plusMonths(s.durationMonths);
            boolean active = !today.isAfter(expiryDate);
            long daysRemaining = ChronoUnit.DAYS.between(today, expiryDate);

            System.out.println("User: " + s.userName);
            System.out.println("  Start Date: " + s.startDate.format(formatter));
            System.out.println("  Duration: " + s.durationMonths + " months");
            System.out.println("  Expiry Date: " + expiryDate.format(formatter));
            System.out.println("  Status: " + (active ? "ACTIVE" : "EXPIRED"));
            System.out.println("  Days Remaining: " + (active ? daysRemaining : "Expired " + Math.abs(daysRemaining) + " days ago"));
            System.out.println();
        }
        sc.close();
    }
}