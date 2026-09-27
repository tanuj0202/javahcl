package DAYseven.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Marks {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(45,90,23,68,12));
		
		System.out.println(list);
		
		int size = list.size();
		
		int total = 0;
		for (Integer mark : list) {
			total+=mark;
		}
		System.out.println("total: "+total);
		System.out.println("average: " + total/size);
		
		System.out.println("highest: " + Collections.max(list));
		System.out.println("lowest: " + Collections.min(list));
	}
}
