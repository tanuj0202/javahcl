package DAYseven;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class treeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(50);
		tree.add(20);
		tree.add(10);
		tree.add(90);
		
		System.out.println(tree);
		
		tree.remove(50);
		System.out.println(tree);
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(103, "Tanuj");
		map.put(107, "Kunal");
		map.put(101, "Siddharth");
		map.put(104, "Adhiraj");
		
		System.out.println(map);
		
		Queue<Character> queue = new LinkedList<>();
//		Deque<Character> queue = new ArrayDeque<>(); // doubly ended queue
		queue.offer('t');
		queue.offer('a');
		queue.offer('n');
		queue.offer('u');
		queue.offer('j');
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
//		queue.p
		System.out.println(queue);
		
		//IN priority queue, by default smallest value has highest priority
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(21);
		pq.offer(25);
		pq.offer(55);
		pq.offer(13);
		
		pq.remove(25);
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
