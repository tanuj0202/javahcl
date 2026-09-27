package DAYone;

import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 2, b = 3, c = a+b;  
        System.out.println("The sum is: " + c);
        float d = 4.5f; 
        System.out.println((int)d);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int e = sc.nextInt();
        System.out.println("you entered: " + e);
        System.out.print("Enter a number: ");
        int f = sc.nextInt();
        System.out.println("you entered: " + f);
        System.out.println("The sum of both entered number is: " + e+f);
        int g = e+f;
        System.out.println("The sum of both entered number is: " + g);
        int h = e-f;
        System.out.println("The difference of both entered number is: " + h);
        int i = e*f;
        System.out.println("The product of both entered number is: " + i);
        try{float j = e/f;
        System.out.println("The division of both entered number is: " + j);
        } catch(ArithmeticException m){
            System.out.println(m);
        }
            System.out.println("asdfsadf");

        double n = 232423.32323d;
        long k = 12242342342344l;
        System.out.println(n);
        System.out.println(k);

        String name = "TANUJ METHI";
        System.out.println("My name is " + name);

        boolean isJavaGood = true;
        System.out.println("Is java good? " + isJavaGood);
        
        sc.close();
    }
}