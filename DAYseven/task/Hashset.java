package DAYseven.task;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Jaipur");
		set.add("Delhi");
		set.add("Noida");
		set.add("Chennai");
		set.add("Jaipur");
		set.add("Mumbai");
		set.add("Jodhpur");
		set.add("Jaipur");
		set.add("Bhilwara");
		
		System.out.println(set);
		
		HashSet<Integer> student = new HashSet<>();
		student.add(45); student.add(56); student.add(12);
		student.add(45); student.add(69);
		
		System.out.println(student);
		System.out.println("Checking 69 present in studnet: " + student.contains(69));
	}
}
