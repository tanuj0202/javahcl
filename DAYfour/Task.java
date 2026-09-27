package DAYfour;

//Using this to Resolve Variable Conflict
class Conflict{
	private String name;
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}

//Using this with Multiple Fields
class MultipleFields{
	int age;
	String name;
	
	public MultipleFields(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	
	void display(){
		System.out.println(name);
	}
}

// Constructor Chaining using this() and Prameterised Constructor chanining as well.
class ConstructorChaining{
	int a;
	int b;
	public ConstructorChaining() {
		System.out.println("This is default Constructor");
	}
	
	public ConstructorChaining(int a) {
		this();
		this.a = a;
		System.out.println("This is parameterised constructor: " + a);
	}
	
	public ConstructorChaining(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println("This is parameterised constructor: " + a+b);
	}
}

//Access parent variable and method using super
class Parent{	
	int a = 45;
	
	public Parent(int a) {
		System.out.println("This is Parent Constructor " + a);
	}
	
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Parent's default Constructor");
	}
	
	void display() {
		System.out.println("This is Parent class display Method");
	}
}

class Child extends Parent{
	int a = 18;
	
	public Child() {
		// TODO Auto-generated constructor stub
		super(69);
	}
	void display() {
		super.display();
		System.out.println("This is child class a: " + a);
		System.out.println("This is parent class a: " + super.a);
	}
}

public class Task {
	public static void main(String[] args) {
		Conflict con = new Conflict();
		con.setName("Tanuj");
		System.out.println(con.getName());
		
		MultipleFields multipleFields = new MultipleFields(21, "Tanmay Khandelwal");
		multipleFields.display();
		
		ConstructorChaining constructorChaining = new ConstructorChaining();
		ConstructorChaining constructorChaining2 = new ConstructorChaining(32);
		ConstructorChaining constructorChaining3 = new ConstructorChaining(32,21);
			
		Child c = new Child();
		c.display();
	}
}
