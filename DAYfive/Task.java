package DAYfive;

class Vehicle2{
	
	int a = 10;
	
	public Vehicle2() {
		System.out.println("Vehicle constructor");
	}
	
	public void start() {
		System.out.println("Vechile starts");
	}
}

class Car2 extends Vehicle2{
	
	int a = 20;
	
	public Car2() {
		System.out.println("Car2 constructor");
	}
	
	public void start() {
		System.out.println("Car starts");
		System.out.println("a from child: " + a);
	}
	
	public String start(String name) {
		return "Car2 starting from start returning String, started by: " + name;
	}
	
	public void parent() {
		super.start();
		System.out.println("a from parent " + super.a);
	}
}

class Student{
	public Student() {
		System.out.println("Noraml Constructor");
	}
	
	public Student(int rollNumber, String name) {
		System.out.println("Parameterised Constructor " + rollNumber + " " + name);
	}
}

abstract class Shape{
	
	abstract float calculateArea(int r);
	abstract float calculateArea(int a, int b);
}

interface Shape2{
	default int area(int r) {
		return r*r;
	}
	
	default int area(int a, int b) {
		return a*b;
	}
}

class Circle extends Shape implements Shape2{
	
	float calculateArea(int r) {
		return (float) 3.14 * r * r;
	}

	float calculateArea(int a, int b) {
		return a*b;
	}
}

class Square extends Shape{

	float calculateArea(int r) {
		return r * r ;
	}
	
	float calculateArea(int a, int b) {
		return a*b;
	}
}

public class Task {
	public static void main(String[] args) {
		Car2 car2 = new Car2();
		
		car2.start(); car2.parent(); System.out.println(car2.start("Tanuj"));
		
		Student s = new Student();
		Student s2 = new Student(851, "Tanuj");
		
		Circle circle = new Circle();
		System.out.println("Area of circle is: "+circle.calculateArea(5));
		System.out.println("Area of circle with two parameters is: "+circle.calculateArea(5,7));
		System.out.println("Area of circle from interface: "+circle.area(4));
		
		Square square = new Square();
		System.out.println("Area of square is: " + square.calculateArea(5));
		System.out.println("Area of rectangle is: " + square.calculateArea(5,10));
	}
}
