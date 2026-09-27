package DAYsix.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowFileNotFOund {
	public static void main(String[] args) throws FileNotFoundException, IOException {
			FileInputStream fis = new FileInputStream("/media/tanuj02/New Volume/java hcl/DAYsix/test.txt");
			System.out.println("Testing file....");
			fis.close();
	}
}
