package dayEight;

class Test2<P, M>{
	P name;
	M age;
	
	Test2(P name, M age){
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

public class GenericTask {
	public static void main(String[] args) {
		Test2<Integer, String> test = new Test2<>(45,"rohit");
		test.display();
		System.out.println("---------------------------------");
		Test2<String, Float> test2 = new Test2<>("Tanuj",21f);
		test2.display();
	}
}
