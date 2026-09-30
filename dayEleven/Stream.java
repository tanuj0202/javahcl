package dayEleven;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		// Example one:
		List<Integer> nums = new ArrayList<>(List.of(45,7,18,76,99, 102, 32));
		
		//Method 1
//		Stream<Integer> n = nums.stream();
//		n = n.filter(x -> x > 10);
//		n = n.map(x -> x*5);
//		n.forEach(System.out :: println);
		
		nums.stream()
			.filter(x -> x > 10)
			.filter(x -> x % 2 == 0)
//			.map(x -> x*2)
			.forEach(System.out :: println);
		
		//Method 3:
//		Stream<Integer> number = nums.stream()
//				.filter(x -> x > 10)
//				.filter(x -> x % 2 == 0);
//		number.forEach(System.out :: println);
		
		List<String> names = new ArrayList<>(List.of("tanuj", "methi", "khandelwal", "tanmay"));
		
		List<String> upperCase = names.stream()
//			.map(x -> x.toUpperCase())
			.map(String :: toUpperCase)
//			.toList();
			.collect(Collectors.toList());
		
		System.out.println(upperCase);
		
		names.stream()
			.map(String :: toUpperCase)
			.filter(x -> x.startsWith("T"))
			.forEach(System.out :: println);
		
		
//		converting list of list to normal list
		List<List<String>> listofList = new ArrayList<>(List.of(
				List.of("Java", "Python"),
				List.of("C++", "C"),
				List.of("Java", "Ruby")
				));
		
		List<String> result = listofList.stream()
				.flatMap(List :: stream)
//				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		
		List<Integer> unsortedList = new ArrayList<>(List.of(34, 12, 45, 18, 76, 4, 23, 45, 76));
		System.out.println("Printing sorted list above 20 and distinct");
		unsortedList.stream()
			.filter(x -> x > 20)
			.sorted()
			.distinct()
//			.skip(3)
//			.limit(3)
			.map(x -> x)
			.forEach(System.out :: println);
	}
}
