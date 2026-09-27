package DAYsix.tasks;

import java.util.Scanner;

public class BankException {
	public static void main(String[] args) throws Exception {
		int balance = 1000;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of withdrawl: ");
		int withdraw = sc.nextInt();
		if(balance - withdraw < 0) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		
		System.out.println("Remaining balance: " + (balance - withdraw));
	}
}
