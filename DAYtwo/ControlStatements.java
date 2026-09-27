package DAYtwo;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your marks");
//        int marks = sc.nextInt();
//
//        if(marks >= 90){
//            System.out.println("you are topper");
//        } else if (marks >= 80 && marks < 90) {
//            System.out.println("you are average");
//        } else {
//            System.out.println("you need to improve");
//        }

//        System.out.print("Enter day number ");
//        int day = sc.nextInt();
//        switch (day){
//                case 1 :
//                System.out.println("Monday");
//                break;
//                case 2 :
//                System.out.println("Tuesday");
//                break;
//                case 3 :
//                System.out.println("Wednesday");
//                break;
//                case 4 :
//                System.out.println("Thursday");
//                break;
//                case 5 :
//                System.out.println("Friday");
//                break;
//                case 6 :
//                System.out.println("Saturday");
//                break;
//                case 7 :
//                System.out.println("Sunday");
//                break;
//
//            default:
//                System.out.println("wrong number entered");
//
//        }

//        System.out.print("Enter your age");
//        int age = sc.nextInt();
//
//        if(age>=18 && age <= 35){
//            System.out.println("you are young");
//        } else if (age > 35 && age <= 60) {
//            System.out.println("You are not young");
//        } else if (age > 60) {
//            System.out.println("You are old");
//        } else{
//            System.out.println("you are a kid");
//        }

//        System.out.print("Enter the table number ");
//        int table = sc.nextInt();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(table + "*" + i + " = " + table*i);
//        }

//        System.out.println("Enter the range");
//        int range = sc.nextInt();
//        int n = 0;
//        while(n < range){
//            System.out.println("Even numbers are "+n);
//            n += 2;
//        }

//        int k;
//        do {
//            System.out.println("enter a number: ");
//             k = sc.nextInt();
//            if(k == 200) System.out.println("you guess the correct number");
//            else System.out.println("your guess was incorrect");
//        } while (k != 200);

        for(int i = 0; i <= 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        for(int i = 0; i <= 10; i++){
            if(i == 5) continue;
            System.out.println(i);
        }

        System.out.println("---------------------while break----------------------");
        int number = 1;
        while(number < 10){
            if(number == 4) break;
            System.out.println(number);
            number++;
        }
        System.out.println("---------------------while continue----------------------");
        while(number < 10){
            if(number == 7){
                number++;
                continue;
            }
            System.out.println(number);
            number++;
        }

        System.out.println("---------------------function calling----------------------");
        System.out.println("result = " + addNumber(2,5));
    }

    public static int addNumber(int a, int b){
        return a+b;
    }
}
