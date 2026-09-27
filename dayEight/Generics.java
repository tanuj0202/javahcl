package dayEight;

import java.util.ArrayList;
import java.util.List;


// before generics arraylist and other were using 'Object' due to which user inputs the any datatype, now after generics we can specify the type
public class Generics {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<>();
		
		arr.add(114); arr.add("tanuj"); arr.add(true);
		
		System.out.println(arr);
		System.out.println(arr.get(0));
		System.out.println(arr.getFirst());
		System.out.println(arr.getLast());
		System.out.println(arr.contains("tanuj"));
		System.out.println(arr.getClass());
		
		String[] arr1 = new String[4];
		
		arr1[0] = arr.get(0).toString();
		
		System.out.println(arr1[0]);
		arr1[1] = arr.get(1).toString();
		
		arr1[2] = arr.get(2).toString();
		
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
//		System.out.println((String)arr.getFirst());
		System.out.println((String)arr.get(1));
		
		System.out.println("=================Generics=================");
		//List with Generics
		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Raj");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		System.out.println("================= Generics class with <> =================");
		//Generic class with <>
		Test<Integer> obj = new Test<>(10);
		obj.display();
		
		Test<String> sobj = new Test<>("tanuj");
		sobj.display();
	}
}

class Test<T>{ // generic class, hum 'T' ki jagh Kuch bhi alphabet le skte h
	T var;
	
	Test(T var){ 
		this.var = var;
	}
	
	void display() {
		System.out.println(var);
	}
}
