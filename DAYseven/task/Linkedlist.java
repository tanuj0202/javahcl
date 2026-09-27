package DAYseven.task;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("abc"); list.add("efg"); list.add("hij"); list.add("klm");
		System.out.println(list);
		list.addFirst("nop");
		System.out.println(list);
		list.addLast("qrs");
		System.out.println(list);
		
		list.removeFirst(); 
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}
}
