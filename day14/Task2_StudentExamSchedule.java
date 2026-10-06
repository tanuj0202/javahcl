package day14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_StudentExamSchedule {
    static class Exam {
        String subject;
        LocalDate examDate;

        Exam(String subject, LocalDate examDate) {
            this.subject = subject;
            this.examDate = examDate;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Exam> exams = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter number of exams: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject name for exam " + (i + 1) + ": ");
            String subject = sc.nextLine();
            System.out.print("Enter exam date (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate examDate = LocalDate.parse(dateStr, formatter);
            exams.add(new Exam(subject, examDate));
        }

        System.out.println("\n--- Exam Schedule ---");
        LocalDate today = LocalDate.now();
        for (Exam exam : exams) {
            long daysRemaining = ChronoUnit.DAYS.between(today, exam.examDate);
            System.out.println("Subject: " + exam.subject);
            System.out.println("  Exam Date: " + exam.examDate.format(formatter));
            System.out.println("  Day of Week: " + exam.examDate.getDayOfWeek());
            System.out.println("  Days Remaining: " + (daysRemaining >= 0 ? daysRemaining : "Exam passed"));
            System.out.println("  Leap Year: " + (exam.examDate.isLeapYear() ? "Yes" : "No"));
            System.out.println();
        }
        sc.close();
    }
}