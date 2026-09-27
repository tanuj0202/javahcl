package DAYsix.tasks;

import java.util.Scanner;

public class NumberFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in string: ");
		String input = sc.next();
		try {			
			int a = Integer.parseInt(input);
			System.out.println("Enterd value is: " + a);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("You have not enterd numeric value, " + e);
		}
		sc.close();
	}
}
