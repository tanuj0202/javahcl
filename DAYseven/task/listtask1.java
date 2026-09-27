package DAYseven.task;

import java.util.ArrayList;

public class listtask1 {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Tanuj");
		students.add("Methi");
		students.add("Kunal");
		students.add("Garg");
		students.add("Siddharth");
		students.add("Solanki");
		students.add("Mehul");
		students.add("Shah");
		
		System.out.println("see all names");
		for (String stu : students) {
			System.out.println(stu);
		}
		
		students.add("Mohit");
		students.set(1,"Khandelwal");
		students.remove(4);
		
		System.out.println(students);
	}
}
