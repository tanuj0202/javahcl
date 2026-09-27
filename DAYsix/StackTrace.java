package DAYsix;

public class StackTrace {
	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c;
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e);
			e.printStackTrace(); // prints the output in full detail.
//			System.out.println(e.toString());
//			System.out.println(e.getMessage()); // show the description of the exception.
		}
		
		// ARRAY INDEX OUT OF BOUNDS EXCEPTION
		try {			
			int[] numbers = new int[5];
			System.out.println(numbers[5]); // this exception occurs first, so this block will exit form here and will not print below exceptions.
			int result = 10/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndex does not exists");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception exists");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		// CUSTOM EXCEPTION
		
		int age = 15;
		
		if (age < 18) {
			throw new ArithmeticException("Age must me more than 18");
		}
		
		System.out.println(age);
	}
}
