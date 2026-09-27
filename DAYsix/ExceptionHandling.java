package DAYsix;

import java.io.FileInputStream;

public class ExceptionHandling {
	public static void main(String[] args){
		
		// ARITHMETIC EXCEPTION
		System.out.println(35/7);
		try {			
			System.out.println(42/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Can't divide by zero, " + e);
		}
		System.out.println(14-85/7);
		
		// FILE NOT FOUND EXCEPTION
		try {
			FileInputStream fis = new FileInputStream("/media/tanuj02/New Volume/java hcl/DAYsix/test.txt");
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("file not found exception, " + e);
		}
		System.out.println("Testing file....");
		
		// CLASS NOT FOUND EXCEPTION
		
		try {
			Class.forName("com.mysql.jdbc.driver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Checking class not found exception");
		
		try {			
//			int a = 100, b = 0, c;
			int a = 100, b = 1, c;
			c = a/b; // compiler ne / by zero nahi pakda
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch  block of finally");
		}
		finally {			
			System.out.println("checking runtime exception");
		}
		
		// NULL POINTER EXCEPTION
		String name = null;
		try {			
			System.out.println(name.length());
		} catch (Exception e) { // here 'e' is reference variable
			// TODO: handle exception
			System.out.println("checking null pointer exception, " + e);
		}
	}
}
