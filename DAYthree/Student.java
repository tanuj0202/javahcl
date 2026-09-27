package DAYthree;

class Solution{
	int rollNumber;
	String name;
	double marks;
	String course;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("RollNumber: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Course: " + course);
	}
}
// rollnumber, name, course, marks
public class Student {
	
	public void get(String name) {
		System.out.println(name + " is eating");
	}
	
	public void set(String name) {
		System.out.println(name + " is dancing");
	}
	
	public static void main(String[] args) {
//		Solution sol = new Solution(851, "Tanuj Methi");
//		
//		System.out.println(sol.getRollNumber());
//		System.out.println(sol.getName());
//		
//		sol.setName("Tanuj Khandelwal");
//		System.out.println("new name: "+sol.getName());
//		
//		Solution sol2 = new Solution(02, "Tanishq khandelwal");
//		System.out.println(sol2.getName() + " " + sol2.getRollNumber());
		
		Solution sol = new Solution();
		sol.setCourse("Btech CSE");
		sol.setMarks(98);
		sol.setName("Tanuj Methi");
		sol.setRollNumber(851);
		
		sol.display();
		
//		System.out.println("-----------Sol 2---------------");
//		
//		Solution sol2 = new Solution();
//		Scanner sc = new Scanner(System.in);
//		
//		int rollNumber = sc.nextInt();
//		sol2.setRollNumber(rollNumber);
//		int marks = sc.nextInt();
//		sol2.setMarks(marks);
//		String name = sc.next();
//		sol2.setName(name);
//		String course = sc.next();
//		sol2.setCourse(course);
//		
//		sol2.display();
//		System.out.println("-----------------------------");
//		sol2.display();		
		System.out.println("-----------------------------");
		Student student = new Student();
		student.get("Rahul");
		student.set("Rahul");
		Student student2 = new Student();
		student2.get("Raj");
		student2.set("Raj");
		
		System.out.println("--------------DEFAULT CONSTRUCTOR---------------");
		
		DefaultConstructor defaultConstructor = new DefaultConstructor();
		System.out.println("age: " + defaultConstructor.age);
		System.out.println("name: " + defaultConstructor.name);
		
		System.out.println("--------------PARAMETERISED CONSTRUCTOR---------------");
		
		ParamConstructor paramConstructor = new ParamConstructor("Tanmay", 43);
		paramConstructor.display();
	}
}

class DefaultConstructor{
	String name;
	int age;
}
class ParamConstructor{
	String name;
	int age;
	
	void display() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
	
	public ParamConstructor(String n, int a) {
		name = n;
		age = a;
	}
}
