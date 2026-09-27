package DAYthree;

import java.util.Scanner;

//1
class Basic {
	String name;
}

class NewStudent{
	String name;
	int rollNumber;
	
	void display() {
		System.out.println(name);
		System.out.println(rollNumber);
	}
}

class Rectangle{
	
	int area(int length, int breath) {
		return length*breath;
	}
}

class Employee{
	String name;
	int age;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void display() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee age: " + age);
	}
	
	void calculateSalary() {
		int tax = 200;
		salary -= tax;
	}
}

public class Task {
	public static void main(String[] args) {
		
		//1
		Basic basic = new Basic();
		basic.name = "Tanuj Methi";
		System.out.println(basic.name);
		
		//2 
		Basic b2 = new Basic();
		b2.name = "Tanuj Khandelwal";
		System.out.println(b2.name);
		
		//3
		NewStudent newStudent = new NewStudent();
		newStudent.name = "new student";
		newStudent.rollNumber = 432;
		newStudent.display();
		
		//4
		Employee employee = new Employee();
		employee.setAge(23); employee.setName("Emp1");
		employee.display();
		employee.salary = 1700;
		employee.calculateSalary();
		//5
		System.out.println(employee.salary);
		
		//6
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.area(4, 3));
		
		//7
		Circle circle = new Circle();
		circle.area(3);
		circle.circumference(3);
		
		//8 and 12
		Bank bank = new Bank(10000);
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		bank.deposite(amount);
		bank.withdraw(amount);
		
		//9 and 11
		Car car = new Car();
		System.out.println(car.name);
		System.out.println(car.color);
		
		//13 and 10
		Result result = new Result(23, 45);
		System.out.println("total marks "+result.totalMarks());
		System.out.println("grade "+result.grade());
		
		// 14
		Result result2 = new Result();
		System.out.println("Enter marks 1");
		result2.marks1 = sc.nextInt();
		System.out.println("Enter marks 2");
		result2.marks2 = sc.nextInt();
		System.out.println("Enter marks 3");
		result2.marks3 = sc.nextInt();
		System.out.println("total marks of user input: " + result2.totalMarks());
		System.out.println("grade of user Input: " + result2.grade());
		
		//17
		Result result3 = new Result(67,32);
		System.out.println(result3.totalMarks());
		
		//18
		Result result4 = result3;
		System.out.println(result4.totalMarks());
		
		//15
		Result result5 = new Result(32);
		result5.marks2 = 45;
		System.out.println(result5.totalMarks());
		
		sc.close();
	}
}

class Circle{
	void area(int radius) {
		System.out.println(3.14 * radius * radius);
	}
	
	void circumference(int radius) {
		System.out.println(2 * 3.14 * radius);
	}
}

class Bank{
	int balance;
	public Bank(int balance) {
		this.balance = balance;
	}
	
	void deposite(int amount) {
		if(amount < 0) {System.out.println("Negative value is not allowed");
			return;
		}
		this.balance += amount;
		System.out.println(balance);
	}
	
	void withdraw(int amount) {
		if(amount > balance) {System.out.println("Amount is greater than balance");
		return;
		}
		this.balance -= amount;
		System.out.println("Remaining balance: " + balance);
	}
}

class Car{
	String name = "i10";
	String color = "white";	
}

class Result{
	int marks1; int marks2; int marks3;
	
	public Result(int marks1, int marks2) {
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	
	public Result(int marks1) {
		this.marks1 = marks1;
	}
	
	public Result() {
		
	}
	
	int totalMarks() {
		return marks1 + marks2 + marks3;
	}
	
	float per() {
		return totalMarks()/3;
	}
	
	String grade() {
		if(per() > 90) {
			return "A";
		} else if(per() >= 80 && per() < 90) {
			return "B";
		} else {
			return "C";
		}
	}
}