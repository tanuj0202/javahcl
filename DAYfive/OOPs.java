package DAYfive;

// compile time: Method overloading.  same class ---> only parameters change.
// run time: Method overriding.  child class over rides the parent class method

class Polymorphism{
	
	public Polymorphism() {
		System.out.println("This is polymorphism constructor");
	}
	 
	public int add(int a, int b) {
		return a+b;
	}
	
	public float add(float a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
}

// single level inheritance.
class MethodOverriding extends Polymorphism{

	public int add(int a, int b) {
		return a-b;
	}
	
	public int add(int a, int b, int c) {
		return a-b-c;
	}
}

// multi-level inheritance.
class Inheritance extends MethodOverriding{
	public float add(float a, int b) {
		return a - b;
	}
}

public class OOPs {
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		
		System.out.println(polymorphism.add(45,93));
		System.out.println(polymorphism.add(45.3f,93));
		System.out.println(polymorphism.add(45,93,69));
		
		MethodOverriding methodOverriding = new MethodOverriding();
		
		System.out.println(methodOverriding.add(93,45)); // runtime polymorphism yeha ho rahi h
		System.out.println(methodOverriding.add(93,45,69));
		
		polymorphism = new MethodOverriding();
		System.out.println(polymorphism.add(45,93,69));
		
		Polymorphism poly = new MethodOverriding();
		
		System.out.println(poly.add(23, 12));
		
		System.out.println("---------------MULTILEVEL INHERITANCE---------------");
		
		Inheritance inheritance = new Inheritance();
		System.out.println("calling methodOverriding's add"+inheritance.add(32, 45));
		System.out.println("calling inheritance's add"+inheritance.add(32.5f, 45));
	}
}