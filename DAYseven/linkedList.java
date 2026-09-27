package DAYseven;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Jaipur");
		list.add("Delhi");
		list.add("Bombay");
		
		System.out.println(list);
		
		list.addFirst("Nodia");
		list.addLast("Pune");
		
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		list.remove();
		System.out.println(list);
		
		list.remove("Delhi");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Tanuj");
		set.add("Amit");
		set.add("Neha");
		set.add("Tanuj");
		
		System.out.println(set);
	}
}
