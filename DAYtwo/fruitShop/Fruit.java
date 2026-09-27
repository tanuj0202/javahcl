package DAYtwo.fruitShop;

import java.util.Scanner;

public class Fruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		bank.setBalance(10000);
		
		boolean open = true;
		do {
			System.out.println("Press 1 for bank");
			System.out.println("Press 2 for fruit");
			System.out.println("Press other to close the program");
			int option = sc.nextInt();
			if(option == 1) {
				boolean bankOpen = true;
				do {
					System.out.println("Press 1 to check balance");
					System.out.println("Press 2 to deposite money");
					System.out.println("Press 3 to withdraw money");
					System.out.println("Press other to exit out of bank");
					
					int bankOption = sc.nextInt();
					switch (bankOption) {
					case 1:
						System.out.println(bank.getBalance());
						break;
					case 2:
						System.out.print("Enter amount to deposite: ");
						int amount = sc.nextInt();
						System.out.println(bank.deposite(amount));
						break;
					case 3:
						System.out.print("Enter amount to withdraw: ");
						int amountWithdraw = sc.nextInt();
						System.out.println(bank.withdraw(amountWithdraw));
						break;
					default:
						bankOpen = false;
					}
				} while (bankOpen);
			} else if(option == 2) {
				int[] fruitsPrice = {25,30,90,15};
				int[] fruitsQuantity = {100, 25, 5, 32};
				int[] fruitCart = new int[fruitsPrice.length];
				
				boolean fruitOpen = true;
				int cartPrice = 0;
				do {
					System.out.println("Enter 1 to buy banana");
					System.out.println("Enter 2 to buy orange");
					System.out.println("Enter 3 to buy mango");
					System.out.println("Enter 4 to buy apple");
					System.out.println("Enter 5 to go on cartPage");
					System.out.println("Enter other to exit fruit shop");
					
					int f = sc.nextInt();
					switch (f) {
					case 1:
						System.out.println("remaining quantity of banana: " + fruitsQuantity[0]);
						System.out.print("Enter quantity to buy banana: ");
						fruitCart[0] = sc.nextInt();
						if(fruitCart[0] > fruitsQuantity[0]) {
							System.out.println("Not enough quantity available");
							break;
						}
						fruitsQuantity[0] -= fruitCart[0];
						cartPrice += fruitCart[0] * fruitsPrice[0];
						break;
					case 2:
						System.out.println("remaining quantity of orange: " + fruitsQuantity[1]);
						System.out.print("Enter quantity to buy orange: ");
						fruitCart[1] = sc.nextInt();
						if(fruitCart[1] > fruitsQuantity[1]) {
							System.out.println("Not enough quantity available");
							break;
						}
						fruitsQuantity[1] -= fruitCart[1];
						cartPrice += fruitCart[1] * fruitsPrice[1];
						break;
					case 3:
						System.out.println("remaining quantity of mango: " + fruitsQuantity[2]);
						System.out.print("Enter quantity to buy mango: ");
						fruitCart[2] = sc.nextInt();
						if(fruitCart[2] > fruitsQuantity[2]) {
							System.out.println("Not enough quantity available");
							break;
						}
						fruitsQuantity[2] -= fruitCart[2];
						cartPrice += fruitCart[2] * fruitsPrice[2];
						break;
					case 4:
						System.out.println("remaining quantity of apple: " + fruitsQuantity[3]);
						System.out.print("Enter quantity to buy apple: ");
						fruitCart[3] = sc.nextInt();
						if(fruitCart[3] > fruitsQuantity[3]) {
							System.out.println("Not enough quantity available");
							break;
						}
						fruitsQuantity[3] -= fruitCart[3];
						cartPrice += fruitCart[3] * fruitsPrice[3];
						break;
					case 5:
						System.out.println("Your cart price is: " + cartPrice);
						System.out.println("Enter 1 to proceed for checkout: ");
						System.out.println("Enter 2 to cancel checkout: ");
						int checkOut = sc.nextInt();
						if(checkOut == 1) {
							if(cartPrice <= bank.getBalance()) {
								System.out.println("Your checkout is successful");
								bank.setBalance(bank.getBalance()-cartPrice);
								System.out.println("Your remaining balance is: " + bank.getBalance());
							} else {
								System.out.println("Insufficient balance");
							}
						} else {
							System.out.println("You cancel the checkout");
						}
						break;

					default:
						fruitOpen = false;
					}
				} while (fruitOpen);
			} else {
				open = false;
			}
		} while (open);
		
		sc.close();
	}
}
