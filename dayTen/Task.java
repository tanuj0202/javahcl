package dayTen;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import DAYseven.task.employeeId;

public class Task {
	public static void main(String[] args) {
		//1. checking even using lambda
		Predicate<Integer> checkEven = (number) -> number % 2 == 0;
		
		System.out.println("CheckEven "+checkEven.test(6));
		System.out.println("CheckEven "+checkEven.test(7));
		
		//2. Check Possitve using lambda
		Predicate<Integer> checkPossitive = (number) -> number > 0;
		System.out.println("CheckPossitve "+ checkPossitive.test(6));
		System.out.println("CheckPossitive "+ checkPossitive.test(-7));
		
		//3. Check Voting using lambda
		Predicate<Integer> checkVoting = (number) -> number > 18;
		System.out.println("CheckVoting "+ checkVoting.test(6));
		System.out.println("CheckVoting "+ checkVoting.test(70));
				
		//4. Check Number divisible by 5 using lambda
		Predicate<Integer> check5Divisibility = (number) -> number % 5 == 0;
		System.out.println("Check5Divisibility "+ check5Divisibility.test(6));
		System.out.println("Check5Divisibility "+ check5Divisibility.test(70));
		
		//5. Check String length greater than 5using lambda
		Predicate<String> checkLength5 = (number) -> number.length() > 5;
		System.out.println("checkLength5 "+ checkLength5.test("Tanuj"));
		System.out.println("checkLength5 "+ checkLength5.test("Khandelwal"));
		
		//6. Convert celsius to Fahrenheit using function
		Function<Integer, Integer> celsius = (number) -> number * 9 / 5 + 32;
		System.out.println("Celsius to Fahrenheit: " + celsius.apply(32));
		
		//7. find square of a number using Function
		Function<Integer, Integer> square = number -> number * number;
		System.out.println("Square: "+square.apply(3));
		System.out.println("Square: "+square.apply(9));
		
		//8. Convert a string to uppercase
		Function<String, String> convertToUpperCase = (number) -> number.toUpperCase();
		System.out.println("Convert to Uppercase: " + convertToUpperCase.apply("tanuj"));
		
		//9. Calculate salary after 10% bonus
		Function<Integer, Double> salary = (number) -> (int) number * (number/0.1);
		System.out.println("Salary 10% bonus: " + salary.apply(100));
		
		//10. Print Student name using Consumer
		Consumer<String> consumer = name -> System.out.println(name);
		consumer.accept("Tanuj Methi");
		
		//11. Display Employee details using Consumer
		Consumer<Employee> consumer2 = employee -> System.out.println("Employee name: " + employee.getName() + "\n Employee salary: " + employee.getSalary());
		Employee employee = new Employee("Tanuj", 1750000);
		consumer2.accept(employee);
		
		//12. Calculate and display product price after discount
		Consumer<Integer> consumer3 = number -> System.out.println("Final Price: " + (number - (number * 0.15)));
		consumer3.accept(100);
		
		//13. display pass or fail using consumer
		Consumer<Integer> consumer4 = number -> {
            if (number > 33) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        };
        
        consumer4.accept(45);
        consumer4.accept(31);
        
        //14. Generate random number using supplier
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());
        
        //15. Generate a welcome message using supplier
        Supplier<String> welcome = () -> "Welcome from supplier";
        System.out.println(welcome.get());
        
        //16. Generate a default userName using supplier
        Supplier<String> userName = () -> "Your userName is " + UUID.randomUUID().toString();
        System.out.println(userName.get());
        
        //17. generate current date using supplier
        Supplier<LocalDateTime> currentDate = () -> LocalDateTime.now();
        System.out.println("Current Date: " + currentDate.get());
        
      //18. Print all elements of list using consumer
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45); list.add(10); list.add(7); list.add(18);
        Consumer<ArrayList<Integer>> consumer5 = (nums) -> {
        	for(Integer i : nums) {
        		System.out.println(i);
        	}
        };
        consumer5.accept(list);
        
        //20. Create a Student Result Processing System Using Predicate, Function, Consumer and Supplier
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(45); marks.add(18); marks.add(90); marks.add(95); marks.add(78);
        
        Function<ArrayList<Integer>, Integer> totalMarks = (nums) -> {
        	int mark = 0;
        	for(Integer i : nums) {
        		mark+=i;
        	}
        	
        	return mark;
        };
        
        Supplier<String> welcomeTOStudentPortal = () -> "Welcome to Student Portal";
        
        Predicate<Integer> passOrFail = (mark) -> mark > 33;
        
        Consumer<ArrayList<Integer>> display = (nums) -> {
        	System.out.println(marks);
        };
        
        System.out.println(welcomeTOStudentPortal.get());
        display.accept(marks);
        int sum = totalMarks.apply(marks);
        
        if(passOrFail.test(sum/marks.size())) {
        	System.out.println("you are pass");
        } else {
			System.out.println("you are fail");
		}
	}
}

class Employee{
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
