package day14;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9_OnlineTransactionTimestamp {
    static class Transaction {
        String id;
        Instant timestamp;

        Transaction(String id) {
            this.id = id;
            this.timestamp = Instant.now();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Transaction> transactions = new ArrayList<>();

        System.out.print("Enter number of transactions to record: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction " + (i + 1) + " ID: ");
            String id = sc.nextLine();
            transactions.add(new Transaction(id));
        }

        DateTimeFormatter utcFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss 'UTC' z");
        DateTimeFormatter istFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss z");

        System.out.println("\n--- Transaction Timestamps ---");
        for (Transaction t : transactions) {
            ZonedDateTime utcTime = t.timestamp.atZone(ZoneId.of("UTC"));
            ZonedDateTime istTime = t.timestamp.atZone(ZoneId.of("Asia/Kolkata"));
            System.out.println("Transaction ID: " + t.id);
            System.out.println("  UTC Timestamp: " + utcTime.format(utcFormatter));
            System.out.println("  IST (Asia/Kolkata): " + istTime.format(istFormatter));
            System.out.println();
        }
        sc.close();
    }
}