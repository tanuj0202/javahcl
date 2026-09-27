package DAYsix.tasks;

import java.util.Scanner;

public class ArrayIndexException {
	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index number to get value: ");
		int n = sc.nextInt();
		
		try {
			System.out.println("your result is: " + num[n]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("index is not in array size range, " + e);
		}
	}
}
