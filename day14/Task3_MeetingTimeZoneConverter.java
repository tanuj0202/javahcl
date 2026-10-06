package day14;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task3_MeetingTimeZoneConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Enter meeting date and time in Asia/Kolkata (dd/MM/yyyy HH:mm): ");
        String input = sc.nextLine();
        sc.close();

        LocalDateTime localDateTime = LocalDateTime.parse(input, formatter);
        ZonedDateTime kolkataTime = localDateTime.atZone(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime londonTime = kolkataTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = kolkataTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime tokyoTime = kolkataTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime sydneyTime = kolkataTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("\n--- Meeting Time Zone Conversion ---");
        System.out.println("Kolkata (Asia/Kolkata):     " + kolkataTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z")));
        System.out.println("London (Europe/London):     " + londonTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z")));
        System.out.println("New York (America/New_York): " + newYorkTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z")));
        System.out.println("Tokyo (Asia/Tokyo):         " + tokyoTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z")));
        System.out.println("Sydney (Australia/Sydney):  " + sydneyTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z")));
    }
}