package DAYfive;

class Animal{
	void eat(){
		System.out.println("Animal eats");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Dog eats");
	}
	
	void bark() {
		System.out.println("Dog barks");
	}
	
	void supereat() {
		super.eat();
	}
}

// Hierarchical Inheritance. both dog and mammal are extending same class i.e. Animal
class Mammal extends Animal{
	void mammalEats(){
		System.out.println("Mammal Eats");
	}
}

class Cat extends Mammal{
	void catEats() {
		super.eat();
		super.mammalEats();
		
		System.out.println("Cat eats");
	}
}

public class Practice {
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		animal.eat();
//		animal.supereat();
		
		Dog dog = new Dog();
		
		dog.eat();
		dog.supereat();
		
		System.out.println("----------Multilevel Inheritance------------");
		
		Cat cat =new Cat();
		
		cat.catEats();
		cat.eat(); // calling super's super method.
		cat.mammalEats(); // calling super's method.
	}
}
