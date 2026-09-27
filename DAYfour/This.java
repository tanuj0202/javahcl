package DAYfour;


// this:
class LearnThis{
	String name;
	int rollNumber;
	LearnThis(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	void display() {
		System.out.println("The name is: " + name);
		System.out.println("The rollnumber is: "+ rollNumber);
	}
}


// In this class we are learning the use of 'this' keyword in method
class MethodThis{
	void m1() {
		System.out.println("m1 initialized");
		System.out.print("Method 2 called from m1: ");
		m2(); // here 'this' is automatically taken care by java.
	}
	
	void m2() {
		System.out.println("m2 initialized");		
	}
}

// here we learned the use of this with constructor
/*for java versions *less* than 25 we have to declare 'this' only at the *top* of the any constructor*/
class ConstructorThis{
	
	public ConstructorThis() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorThis(int age) {
		this(); // calling the default constructor
		// we can also pass parameters in this() and it will call that constructor. ex: this(45)
		System.out.println("Parameterised constructor with argument: " + age);
	}
	
	public ConstructorThis(String name) {
		this(34);
		System.out.println("This is string constructor: " + name);
	}
}

class ArgumentThis{ // it is used to pass the object of the class;
	
	int a = 25;
	String name = "tanuj";
	
	void m1() {
		m2(this,45); // this keyword will work as an argument
		System.out.println("M1 is called");
	}
	
	void m2(ArgumentThis s, int a) { // reference of object 
		s.a = a;
		System.out.println("M2 is called " + s.a);
		System.out.println("M2 is called " + s.name);
	}
}

class Demo{
	int rollNumber;
	String name;
	
	public Demo(int rollNumber, String name) {
		// TODO Auto-generated constructor stub
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	void display(Demo d) {
		System.out.println("Name: " + name);
		System.out.println("RollNumber: " + rollNumber);
	}
	
	void show() {
		display(this);
	}
}

public class This {
	public static void main(String[] args) {
		LearnThis lt = new LearnThis(45, "Tanuj");
		lt.display();
		
		System.out.println("------------------------------------------");
	
		MethodThis mThis = new MethodThis();
		mThis.m1();
		mThis.m2();

		System.out.println("------------------------------------------");
		
//		ConstructorThis cThis = new ConstructorThis();
//		ConstructorThis cThis2 = new ConstructorThis(45);
		ConstructorThis cThis3 = new ConstructorThis("Tanuj");
		
		System.out.println("------------------------------------------");
		
		ArgumentThis something = new ArgumentThis();
		something.m1();
		
		System.out.println("-----------------DEMO-------------------------");
		Demo d = new Demo(32, "tanuj");
		d.show();
		System.out.println("---------");
		
		Demo d2 = new Demo(45, "rohit");
		d.display(d2);
		System.out.println("---------");
		d2.show();
		System.out.println("---------");
		d2.display(d);
	}
}
