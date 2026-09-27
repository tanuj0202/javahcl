package DAYsix.tasks;

public class MultipleCatch {
	public static void main(String[] args) {
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
	}
}
