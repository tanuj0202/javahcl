package DAYsix.tasks;

public class throwTask {
	public static void main(String[] args) {
		int age = 15;
		
		if (age < 18) {
			throw new ArithmeticException("Age must me more than 18");
		}
		
		System.out.println(age);
	}
}
