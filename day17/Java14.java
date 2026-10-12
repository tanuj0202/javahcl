package day17;

import java.util.Scanner;

public class Java14 {
    public static void main(String[] args) {
        // traditionial switch based
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of week: ");
        int day = sc.nextInt();
        String result;

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid input";
                break;
        }

        System.out.println(result);
        
        // new switch expression
        String result2 = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("With switch-expression: " + result2);

        String result3 = switch(day){
            case 1,2,3,4,5 -> "Weekdays";
            case 6,7 -> "Weekend";
            default -> "Invalid";
        };
        
        System.out.println("Multiple switch case: " + result3);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        String result4 = switch(marks/10){
            case 10, 9, 8 -> {
                System.out.println("Excellent Performance");
                yield "Grade A";
            }
            case 7 -> {
                yield "Grade B";
            }
            case 6 -> {
                yield "Grade C";
            }
            default -> {
                yield "Fail";
            }
        };

        System.out.println("your result: " + result4);

        //switch with enum
        Level level = Level.HIGH;
        String message = switch (level){
            case LOW -> "Low Priority";
            case MEDIUM -> "Medium Priority";
            case HIGH -> "High Priority";
        };

        System.out.println(message);
        sc.close();
    }
}

enum Level{
    LOW,MEDIUM,HIGH
}