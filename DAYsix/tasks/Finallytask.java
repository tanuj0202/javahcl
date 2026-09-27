package DAYsix.tasks;

import java.util.Scanner;

public class Finallytask {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		
		try {
			System.out.println("result: " + a/b);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("b can't be zero, " + e);
		} finally {
			System.out.println("this block will always run");
		}
	}
}
