package DAYseven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/* these are classes + interfaces
it's package is 'util'
*/
public class CollectionFramework {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Tanuj");
		list.add("Khandelwal");
		list.add("Methi");
		System.out.println(list);
		System.out.println(list.get(0));
		
		// with Object we can store multiple types of data
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add(21);
		list2.add("tanuj");
		list2.add(21.3);
		list2.add('m');
		System.out.println(list2);
		
		HashSet<Object> set = new HashSet<>();
		set.add("tanuj");
		set.add(02);
		set.add("methi");
		set.add("anuj");
		System.out.println(set);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(103, "Methi");
		map.put(02, "Tanuj");
		map.put(01, "Tanuj");		
		System.out.println(map);
		System.out.println("value at key: " + map.get(103));
 		System.out.println("contains key: " + map.containsKey(01));
		System.out.println("removing key: " + map.remove(01));
		System.out.println("contains key: " + map.containsKey(01));
		System.out.println(map.put(02, "Khandelwal"));
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to add in map: ");
		String temp = sc.next();
		System.out.print("Enter the key integer to add in map: ");
		int temp2 = sc.nextInt();
		map.put(temp2, temp);
		System.out.println(map);
		map.put(103, "baniya");
		System.out.println("contains value: " + map.containsValue("Baniya")); // it is case-sensetive
		
		ArrayList<String> students = new ArrayList<>();
		students.add("Rahul");
		students.add("amit");
		students.add("Neha");
		students.add("Rahul");
		
		System.out.println(students);
		System.out.println(students.get(0));
		students.set(2, "Shan");
		students.remove(1);
		students.remove("Rahul"); // remove the first occurrence of "Rahul" and it is case-sensetive as well.
		System.out.println(students);
		
		System.out.println("-----------------------------------");
		System.out.println("Map key set iteration");
		for(Integer key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("Map values iteration");
		for (String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("Looping on both key and values together");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}
}
