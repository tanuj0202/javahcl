package DAYtwo;


import java.util.Scanner;

public class task {
    static void main() {
        // taking input in java
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // largest of two numbers;
        System.out.println("enter two numbers for largest");
        int a = sc.nextInt(); int b = sc.nextInt();
        System.out.println(largest(a,b));

        //largest of three numbers;
        System.out.println("enter third number");
        int c = sc.nextInt();
        System.out.println(largestOfThreeNumbers(a,b,c));

        //even or odd
        System.out.println("enter number for even odd");
        int k = sc.nextInt();
        if(k % 2 == 0){
            System.out.println("Entred number is even");
        }
        else System.out.println("Entred number is odd");

        //multiplication table;
        System.out.println("Enter number of table");
        int table = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(table + "*" + i + " = " + table*i);
        }

        //factorial of number;
        System.out.println("Enter the number for factorial");
        int f = sc.nextInt();
        System.out.println(factorial(f));

        //reverse a number
        System.out.println("Enter the number to reverse");
        int rev = sc.nextInt();
        System.out.println(reverseNumber(rev));

        //palindrome number;
        System.out.println("Check pallindrome");
        if(rev == reverseNumber(rev)) System.out.println("number is  palindrome");
        else System.out.println("number is not palindrome");

        //count digits
        System.out.println("Counting digits");
        System.out.println(countingDigits(rev));

        //sum of digits
        System.out.println("Sum of digits");
        System.out.println(sumOfDigits(rev));

        //armstrong number
        System.out.println("Checking the number is Armstrong");
        int digits = countingDigits(rev);
        if(rev == armstrongNumber(rev,digits)) System.out.println("Number is armstrong");
        else System.out.println("number is not armstrong");

        //fibonacci number
        System.out.println("Fibonacci number");
        int fib = sc.nextInt();
        System.out.println("Fibonacci number = " + fibonacci(fib));

        //swap two numbers;
//        System.out.println("Swap two number");
//        int x = sc.nextInt(); int z = sc.nextInt();
//        z = (x*z)/z;
//        x = (x*z)/x;
//
//        System.out.println(x + " " + z);

        // armstrong number from 1 to 1000;
        System.out.println("armstrong number from 1 to 1000");
        for(int i = 0; i <= 1000; i++){
            int d = countingDigits(i);
            if(i == armstrongNumber(i, d)) System.out.println(i);
        }


    }

    private static int fibonacci(int fib) {
        if(fib == 0) return 0;
        if(fib == 1) return 1;

        return fibonacci(fib-1) + fibonacci(fib-2);
    }

    private static int armstrongNumber(int rev, int digits){
        int x = rev;
        int ans = 0;
        while(x != 0){
            int last = x % 10;
            ans += Math.pow(last, digits);
            x /= 10;
        }

        return ans;
    }

    private static int sumOfDigits(int rev) {
        int x = rev;
        int sum = 0;
        while(x != 0){
            int last = x % 10;
            sum += last;
            x /= 10;
        }

        return sum;
    }

    private static int countingDigits(int rev) {
        int x = rev;
        int count = 0;
        while(x != 0){
            count++;
            x /= 10;
        }
        return count;
    }

    private static int reverseNumber(int rev) {
        int x = rev;
        int ans = 0;
        while(x != 0){
            int last = x % 10;
            ans = ans * 10 + last;
            x /= 10;
        }
        return ans;
    }

    private static int factorial(int f) {
        if(f == 0 || f == 1) return 1;

        return f * factorial(f-1);
    }

    public static int largest(int a, int b){
        if( a > b) return a;
        return b;
    }

    public static int largestOfThreeNumbers(int a, int b,  int c){
        if( a > b && a > c){
            return a;
        }
        if( b > a && b > c) return b;
        else return c;
    }
}
