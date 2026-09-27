package DAYfour;

class Animal{
	
	public Animal() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("This is constructor of animal");
		//whenever the child class object will be created, this will run
	}
	
	void display() {
		System.out.println("This is parent class");
	}
}

class dog extends Animal{
	String name; //default access
	void display() {
		System.out.println("This is child class");
//		super.display();
	}
	
	public dog() {
		// TODO Auto-generated constructor stub
		System.out.println("This is child class constructor");
	}
}

public class LearnInheritance {
	public static void main(String[] args) {
		dog d = new dog();
		d.name = "asdfsadf";
		System.out.println(d.name);
		d.display();
	}
}
