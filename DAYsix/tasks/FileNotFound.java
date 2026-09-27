package DAYsix.tasks;

import java.io.FileInputStream;

public class FileNotFound {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("/media/tanuj02/New Volume/java hcl/DAYsix/test.txt");
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("file not found exception, " + e);
		}
		System.out.println("Testing file....");
	}
}
