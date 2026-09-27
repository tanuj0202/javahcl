package DAYsix;

import java.io.FileOutputStream;

public class FileHandling {
	public static void main(String[] args) throws Exception{
		FileOutputStream output = new FileOutputStream("/media/tanuj02/New Volume/java hcl/DAYsix/test.txt");
		output.write("Hello".getBytes());
		output.close();
		System.out.println("written in file...");
	}
}
