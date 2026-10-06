package day14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6_DateFormattingParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LocalDate> dates = new ArrayList<>();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter number of dates: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter date " + (i + 1) + " (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate date = LocalDate.parse(dateStr, inputFormatter);
            dates.add(date);
        }

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

        System.out.println("\n--- Date Format Conversion ---");
        for (LocalDate date : dates) {
            System.out.println("Original: " + date.format(inputFormatter));
            System.out.println("  dd-MM-yyyy:       " + date.format(fmt1));
            System.out.println("  MMMM dd, yyyy:    " + date.format(fmt2));
            System.out.println("  EEEE, dd MMMM yyyy: " + date.format(fmt3));
            System.out.println();
        }
        sc.close();
    }
}