package dayEight;

interface Printable{
	void print();
}

class Person{
	void display() {
		System.out.println("Person");
	}
}

class Demo<G extends Person & Printable>{ // it automatically implementing Printable. we have restricted it that it can take input of only that class which have these both
	G val;
	
	public Demo(G val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	void show(){
		val.display();
		val.print();
	}
}

class Student extends Person implements Printable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Student");
	}
}

public class MultipleBounds {
	public static void main(String[] args) {
		Demo<Student> obj = new Demo(new Student());
		obj.show();
	}
}
