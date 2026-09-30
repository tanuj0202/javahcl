package dayEleven.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
	public static void main(String[] args) {
//1.		Create a Stream from a List Create a List<Integer> containing 10 integers. Create a stream from the list and display all elements using forEach(). 
		List<Integer> list = new ArrayList<>(List.of(1,2,30,40,50,60,70,80,90,100));
		
		list.stream()
			.forEach(System.out :: println);
		
//		2.Given a list of integers, use filter() to select and display only the even numbers. 
		
		list.stream()
			.filter(x -> x % 2 == 0)
			.forEach(System.out :: println);
		
//		3.Create a list of integers and use a stream to display only numbers greater than 50. 
		
		list.stream()
			.filter(x -> x > 50)
			.forEach(System.out :: println);
		
//		4. Given a list of integers, use map() to calculate the square of every number and display the results. 
		
		list.stream()
			.map(x -> x*x)
			.forEach(System.out :: println);
			
//		5.Create a list of student names and use map() to convert every name to uppercase. 
		
		List<String> student = new ArrayList<>(List.of("shan", "tanuj", "Khandelwal", "methi", "siddharth"));
		
		student.stream()
			.map(String :: toUpperCase)
			.forEach(System.out :: println);
		
//		6. Create a list of names and use filter() to display only names whose first character is S. 
		student.stream()
			.filter(x -> x.startsWith("s"))
			.forEach(System.out :: println);
		
//		7.Given a list of integers, use filter() to select numbers greater than 10, then use map() to multiply each selected number by 2. 
		list.stream()
			.filter(x -> x > 10)
			.map(x -> x*2)
			.forEach(System.out :: println);
		
//		8. Create a list containing duplicate integers. Use distinct() to remove duplicates and display the unique values. 
			List<Integer> list2 = new ArrayList<>(List.of(2,4,5,2,8,4,9,3));
			
			list2.stream()
				.distinct()
				.forEach(System.out :: println);
			
//		9. Create an unsorted list of integers and use sorted() to display the numbers in ascending order. 	
			list2.stream()
			.sorted()
			.forEach(System.out :: println);
			
//		10. Create a list of student names and use sorted() to arrange and display them in alphabetical order.
			
			student.stream()
			.sorted()
			.forEach(System.out :: println);
			
//		11. Create a stream containing numbers from 1 to 20. Use skip() to skip the first 5 numbers and limit() to display the next 5 numbers. 
			List<Integer> oneTo20 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
			
			oneTo20.stream()
				.skip(5)
				.limit(5)
				.forEach(System.out :: println);

//		12. Given a list of integers, use filter() and count() to find how many numbers are divisible by 5. 
			System.out.println(oneTo20.stream()
				.filter(x -> x % 5 == 0)
				.count());
				
//		13.Create a list of integers and use the terminal operations max() and min() to find the largest and smallest values. 
			
			System.out.println("max: "+list2.stream().max(Comparator.naturalOrder()));
			System.out.println("min: "+list2.stream().min(Comparator.naturalOrder()));
			
//		14. Create a list of integers and use reduce() to calculate the sum of all elements. 
			System.out.println("sum using reduce: " + list2.stream()
					.reduce((a,b) -> a+b)
					);
			
//		15. Create a list of marks and use anyMatch() to check whether at least one student has scored more than 90. 
			List<Integer> marks = new ArrayList<>(List.of(36,64,96,78,99,54, -1));
			System.out.println(marks.stream().anyMatch(x -> x > 90));
			
//		16. Create a list of marks and use allMatch() to check whether all students have scored at least 40. 
			System.out.println(marks.stream()
				.allMatch(x -> x > 40));
			
//		17.Create a list of numbers and use noneMatch() to check whether none of the numbers is negative. 
			System.out.println(marks.stream()
					.noneMatch(x -> x < 0));
			
//		18.	Create a List<List<String>> containing programming languages grouped into different lists. Use flatMap() to convert it into a single stream of strings. 
			List<List<String>> listofList = new ArrayList<>(List.of(
					List.of("Java", "Python"),
					List.of("C++", "C"),
					List.of("Java", "Ruby")
					));
			
			List<String> result = listofList.stream()
					.flatMap(List :: stream)
//					.distinct()
					.collect(Collectors.toList());
			
			System.out.println(result);
			
//		19.Given a list of names, perform the following operations in sequence: 
//			o	Filter names starting with "S" 
//			o	Convert them to uppercase 
//			o	Remove duplicates 
//			o	Sort alphabetically 
//			o	Display the final result 
			
			student.stream()
				.filter(x -> x.startsWith("S"))
				.map(String :: toUpperCase)
				.distinct()
				.sorted()
				.forEach(System.out :: println);
			
//			20. Create a list of integers and build a stream pipeline using filter(), map(), distinct(), sorted(), and peek(). Use peek() to display the elements at an intermediate stage and use collect() to store the final result in a list.
			
			List<Integer> finalList = list2.stream()
					.filter(x -> x % 2 == 0)
					.peek(e -> System.out.println(e))
					.map(x -> x *2)
					.peek(e -> System.out.println(e))
					.distinct()
					.peek(e -> System.out.println(e))
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println(finalList);
	}
}
