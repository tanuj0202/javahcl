package dayEight;

import java.util.Scanner;

public class LearnComparable {
	// yeha pe bhi har jagah alphabet same hona chaiye
	static <J extends Comparable<J>> J max(J a, J b) {
		if(a.compareTo(b) > 0) {
			return a;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println(max(13,21));
		System.out.println(max("pzva","python")); // comparing abcd...
		
		// taking input
		Scanner sc = new Scanner(System.in);
		Number<Integer> obj = new Number<>();
		Number<Integer> obj2 = new Number<>();
		Number<String> obj3 = new Number<>();
		
		System.out.println(Number.count);
		sc.close();
	}
}

class test3<T>{
	T var;
	
	public test3(T var) {
		// TODO Auto-generated constructor stub
		this.var = var;
	}
	
	void display() {
		System.out.println(var);
	}
}

class Number<T>{ 
	static int count; // this is counting the number of object's we have created for this class;
	
	public Number() {
		// TODO Auto-generated constructor stub
		count++;
	}
}