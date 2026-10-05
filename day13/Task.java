package day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task {
	public static void main(String[] args) {
//		1. Employee Salary Filter: Given a list of employees, use the Streams API to find employees earning more than ₹50,000, sort them by salary, and collect their names into a list.
		List<Employee> employees = new ArrayList<>(
				List.of(new Employee(10000, "sarthak", "CSE"),
						new Employee(30000, "tanmay", "AIDS"),
						new Employee(20000, "kunal", "AIDS"),
						new Employee(15000, "mehul", "ECE"),
						new Employee(75000, "tanuj", "CSE"),
						new Employee(59000, "uday", "ECE"))
				);
		
		List<String> employeeName = employees.stream()
				.filter(x -> x.getSalary() > 50000)
				.sorted()
				.map(y -> y.getName())
				.collect(Collectors.toList());
		
		System.out.println(employeeName);
		
//		2. Student Marks Analysis: Given a list of students and their marks, find students who scored above 60, calculate the average marks, and identify the highest scorer using Streams.
		int sum = employees.stream()
		        .map(x -> x.getSalary())
		        .reduce(0, (a, b) -> a + b);
		Long count = employees.stream().count();
		
		Long average = (long) sum / count;
		System.out.println("Average salary of employee: " + average);
		
		Optional<Employee> employeeWithHighestSalary = employees.stream()
				.max(Employee :: compareTo);
		System.out.println(employeeWithHighestSalary.get().getSalary());
		
//		3.Product Category Analysis: Given a list of products with names, categories, and prices, group the products by category and calculate the average price of each category using Collectors.
		List<Product> products = new ArrayList<>(
					List.of(new Product("sports", "bat", 1000),
							new Product("phone", "iqoo neo 7", 26000),
							new Product("sports", "ball", 100),
							new Product("phone", "phone case", 500))
				);
		
		Map<String, Double> averageCatMap = products.stream()
				.collect(Collectors.groupingBy(
							x -> x.getCategory(), Collectors.averagingInt(x -> x.getPrice())
						));
		
		System.out.println(averageCatMap);
		
//		4. Word Frequency Counter: Given a paragraph, create a stream of words and use the Collectors API to count the frequency of each word and identify the most frequently occurring word.
		String paragraph = "Word Frequency Counter: Given a paragraph, create a stream of words and use the Collectors API to count the frequency of each word and identify the most frequently occurring word";
		
//		Map<String, Integer> wordFrequencyMap = paragraph.stream
		
//		5. Employee Department Report: Given a list of employees, group them by department, calculate the total salary for each department, and find the highest-paid employee in each department.
		
		Map<String, List<Employee>> groupByDepartment = employees.stream()
				.collect(Collectors.groupingBy(x -> x.getDepartment()));
		
		System.out.println(groupByDepartment);
		
		Map<String, Optional<Employee>> highestPaidEmployee = employees.stream().collect(Collectors.groupingBy(
					x -> x.getDepartment(),
					Collectors.maxBy(Comparator.comparing(y -> y.getSalary()))
				));
		
		for(Map.Entry<String, Optional<Employee>> entry : highestPaidEmployee.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().get().getName());
		}
		
//		6.Stream Creation Practice: Create streams from a list, array, Stream.of(), Stream.generate(), and Stream.iterate(), and perform suitable intermediate and terminal operations on each stream.
		
		
//		8. Optional Employee Search: Create a method that searches for an employee by ID and returns an Optional<Employee>. Use Optional operations to handle both found and not-found cases.
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Optional<Employee> searchEmployee = employees.stream()
				.filter(x -> x.getName().equals(name))
				.findAny();
		if(searchEmployee.isPresent()) {
			System.out.println("Searched employee:");
			System.out.println(searchEmployee.get().getName());
			System.out.println(searchEmployee.get().getSalary());
		} else {			
			System.out.println("Employee with given name not found");
		}
		sc.close();
	}
}

class Employee implements Comparable<Employee>{
	private int salary;
	private String name;
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int salary, String name, String department) {
		this.salary = salary;
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.salary, o.salary);
	}
}

class Product{
	private String category;
	private String name;
	private int price;
	
	
	
	public Product(String category, String name, int price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}