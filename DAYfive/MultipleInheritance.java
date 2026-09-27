package DAYfive;

interface first{
	void display1();
}

interface second{
	void display2();
}

class demo implements first, second{

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("This is display2 method, comming from second interface");
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("This is display1 method, comming from first interface");
		
	}
	
}

public class MultipleInheritance {
	public static void main(String[] args) {
		
	}
}
