package DAYthree;

public class CopyConstructor {
	int age;
	String name;
	
	public CopyConstructor(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args) {
		CopyConstructor cp  = new CopyConstructor(23, "tanmay");
		
		CopyConstructor cp2 = cp;
		cp2.display();
	}
}
