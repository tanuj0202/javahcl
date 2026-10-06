package day14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task8_LastFridayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months to check: ");
        int n = sc.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println("\n--- Last Friday of Each Month ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter year for month " + (i + 1) + ": ");
            int year = sc.nextInt();
            System.out.print("Enter month (1-12) for month " + (i + 1) + ": ");
            int month = sc.nextInt();

            LocalDate date = LocalDate.of(year, month, 1).with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
            System.out.println("Last Friday of " + date.getMonth() + " " + year + ": " + date.format(formatter) + " (" + date.getDayOfWeek() + ")");
        }
        sc.close();
    }
}