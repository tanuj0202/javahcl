package dayEight;

class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}

class Upper<Q extends Animal>{ // here we restricted Q
	Q animal;
	public Upper(Q animal) {
		// TODO Auto-generated constructor stub
		this.animal = animal;
	}
	
	void display() {
		animal.sound();
	}
}

public class UpperBound {
	public static void main(String[] args) {
//		Upper<Animal> obj = new Upper<>(new Dog());
		Upper<Dog> obj = new Upper<>(new Dog());
		obj.display();
	}
}
