package DAYtwo.fruitShop;

public class Bank {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int deposite(int amount) {
		if(amount < 0) {
			System.out.println("amount can't be less than zero");
			return -1;
		}
		
		this.balance += amount;
		
		return balance;
	}
	
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("You don't have enough balance");
			return -1;
		}
		
		this.balance -= amount;
		return balance;
	}
	
}
