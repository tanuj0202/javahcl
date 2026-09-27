package DAYfive;

import java.util.Scanner;

// encapsulation: hides information
// abstraction: hides implementation

abstract class fan{
	abstract void turnOn();
	abstract void turnOff();
}

class fanRemote extends fan{

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turning on fan");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning off fan");
	}
	
}

public class LearnAbstraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		fanRemote obj = new fanRemote();
		
		boolean open = true;
		
		
		do {
			System.out.println("Enter 1 to turnOn fan");
			System.out.println("Enter 2 to turnOff fan");
			System.out.println("Enter 3 to exit fan");
			System.out.print("Enter your input here: ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				obj.turnOn();
				break;
			case 2:
				obj.turnOff();
				break;
			case 3:
				open = false;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (open);
		
		sc.close();
	}
}
