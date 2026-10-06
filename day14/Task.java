package day14;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Task {
	public static void main(String[] args) {
//		1. Employee Joining Date Analysis Create a program that stores an employee's joining date using LocalDate and calculates the employee's total years, months, and days of service using Period.
		
		LocalDate joining = LocalDate.of(2005, 02, 02);
//		Duration total = Duration.between(joining, LocalDate.now());
		Period total = Period.between(joining, LocalDate.now());
		System.out.println(total);
		System.out.println("Years: " + total.getYears());
		System.out.println("Months: " + total.getMonths());
		System.out.println("Days: " + total.getDays());
		
//	2. Given an examination date, use LocalDate to display the day of the week, calculate the number of days remaining until the examination, and determine whether the exam falls in a leap year.
		
		LocalDate examDate = LocalDate.of(2026, 10, 11);
		System.out.println("Exam Day of week: " + examDate.getDayOfWeek());
		long daysRemaining = java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), examDate);
		System.out.println("Number of days remaining: " + daysRemaining);
		if (examDate.isLeapYear()) {
			System.out.println("Exam is in Leap Year");
		} else {
			System.out.println("Exam is not in Leap Year");
		}
		
//		3.Create a program that accepts a meeting date and time in Asia/Kolkata and converts it to America/New_York and Europe/London using ZonedDateTime.
		
		System.out.println("Enter meeting date and time (dd/MM/yyyy HH:mm): ");
		Scanner sc3 = new Scanner(System.in);
		String meetingInput = sc3.nextLine();
		sc3.close();
		
		DateTimeFormatter meetingFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime meetingLocal = LocalDateTime.parse(meetingInput, meetingFormatter);
		ZonedDateTime meetingKolkata = meetingLocal.atZone(ZoneId.of("Asia/Kolkata"));
		
		ZonedDateTime londonTime = meetingKolkata.withZoneSameInstant(ZoneId.of("Europe/London"));
		ZonedDateTime americaTime = meetingKolkata.withZoneSameInstant(ZoneId.of("America/New_York"));

		System.out.println("Kolkata: " + meetingKolkata);
		System.out.println("London: " + londonTime);
		System.out.println("New York: " + americaTime);
		
		
//		4.Accept an employee's date of birth and calculate their exact age in years, months, and days using LocalDate and Period.
		System.out.println("Enter your dob (dd/MM/yyyy): ");
		Scanner sc4 = new Scanner(System.in);
		String dob = sc4.next();
		sc4.close();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dobOfEmployee = LocalDate.parse(dob, dateTimeFormatter);
		Period age = Period.between(dobOfEmployee, LocalDate.now());
		System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
		
//		5.Given the start and end time of a training session, use LocalTime and Duration to calculate the total duration in hours, minutes, and seconds.
		System.out.println("Enter start time (HH:mm): ");
		Scanner sc5 = new Scanner(System.in);
		String startStr = sc5.next();
		System.out.println("Enter end time (HH:mm): ");
		String endStr = sc5.next();
		sc5.close();
		
		LocalTime start = LocalTime.parse(startStr, DateTimeFormatter.ofPattern("HH:mm"));
		LocalTime end = LocalTime.parse(endStr, DateTimeFormatter.ofPattern("HH:mm"));
		Duration d = Duration.between(start, end);
		long hours = d.toHours();
		long minutes = d.toMinutes() % 60;
		long seconds = d.getSeconds() % 60;
		System.out.println("Duration: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
	}	
}
