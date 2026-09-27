package DAYsix.tasks;

public class StringNull {
	public static void main(String[] args) {
		String name = null;
		try {			
			System.out.println(name.length());
		} catch (Exception e) { // here 'e' is reference variable
			// TODO: handle exception
			System.out.println("checking null pointer exception, " + e);
		}
	}
}
