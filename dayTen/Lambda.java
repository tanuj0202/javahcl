package dayTen;

import java.util.Scanner;

// lambda 1: Hello 
interface Greeting{
	public void hello();
}

// this is normal way

//public class Lambda implements Greeting{
//	public static void main(String[] args) {
//		Lambda obj = new Lambda();
//		obj.hello();
//	}
//}

public class Lambda {
	public static void main(String[] args) {
		Greeting obj = () -> System.out.println("Hello");
		obj.hello();
		
		nameInterface obj2 = (name) -> System.out.println("Welcome: " + name);
		obj2.name("Tanuj Methi");
		
		addition obj3 = (a,b) -> a+b;
		System.out.println(obj3.add(32, 13));
		
		GreatestNumber obj4 = (a,b) -> a > b ? a : b;
		System.out.print("Greatest Number");
		System.out.println(obj4.greateNumber(45, 18));
		
		EvenOdd obj5 = (a) -> (a % 2 == 0) ? true : false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int k = sc.nextInt();
		if(obj5.checkEvenOdd(k)) {
			System.out.println(k + " is even");
		}else {
			System.out.println(k + " is odd");
		}
	}
}

interface nameInterface{
	public void name(String name);
}

interface addition{
	public int add(int a, int b);
}

interface GreatestNumber{
	public int greateNumber(int a, int b);
}

interface EvenOdd{
	public boolean checkEvenOdd(int a);
}
