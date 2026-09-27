package DAYseven.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class employeeId {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1004);
		list.add(1007);
		list.add(1000);
		list.add(1500);
		list.add(999);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < 1005) {				
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}
