package day14;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_TrainingSessionDuration {
    static class Session {
        String name;
        LocalTime start;
        LocalTime end;

        Session(String name, LocalTime start, LocalTime end) {
            this.name = name;
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Session> sessions = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Enter number of training sessions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter session " + (i + 1) + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter start time (HH:mm): ");
            String startStr = sc.nextLine();
            System.out.print("Enter end time (HH:mm): ");
            String endStr = sc.nextLine();
            LocalTime start = LocalTime.parse(startStr, formatter);
            LocalTime end = LocalTime.parse(endStr, formatter);
            sessions.add(new Session(name, start, end));
        }

        System.out.println("\n--- Training Session Durations ---");
        for (Session s : sessions) {
            Duration d = Duration.between(s.start, s.end);
            long hours = d.toHours();
            long minutes = d.toMinutes() % 60;
            long seconds = d.getSeconds() % 60;
            System.out.println(s.name + " | " + s.start + " - " + s.end +
                    " | Duration: " + hours + "h " + minutes + "m " + seconds + "s");
        }
        sc.close();
    }
}