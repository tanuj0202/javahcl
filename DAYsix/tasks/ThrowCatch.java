package DAYsix.tasks;

import java.util.Scanner;

public class ThrowCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks = sc.nextInt();
		try {			
			if(marks > 100 || marks < 0) {
				throw new IllegalArgumentException("Marks can't be greater than 100 or smaller than 0");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
