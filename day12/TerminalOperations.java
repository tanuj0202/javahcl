package day12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalOperations {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		// with asList we can only change the values but can't add new
		
		List<Integer> result = numbers.stream()
				.filter(n -> n > 25)
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> names = Arrays.asList("Rahul", "Amit", "Neha");
		
		String result2 = names.stream()
				.collect(Collectors.joining());
		
		System.out.println(result2);
		
		List<Student> students = Arrays.asList(
				new Student("Tanuj", "CSE"),
				new Student("Siddharth", "Distributed Systems"),
				new Student("Kunal", "Law"),
				new Student("Mehul", "CSE")
				);
		
		Map<String, List<Student>> result3 = students.stream()
				.collect(Collectors.groupingBy(
							s -> s.department
						));
				
		System.out.println(result3);
		
		Map<Boolean, List<Integer>> result4 = numbers.stream()
				.collect(Collectors.partitioningBy(
						n -> n % 2 == 0
						));
		
		System.out.println(result4);
	}
}

class Student{
	String name;
	String department;
	
	public Student(String name, String department) {
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + "]";
	}
}