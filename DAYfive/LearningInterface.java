package DAYfive;

// hybrid inheritance: it is the combo of both single and multilevel.

interface Vehicle{ 
	// interface have all the fields as public static final
	int a = 10;
	
	void starts();
	void stops();
	void tyres(int tyre);
	
	default void run() { //by using 'default' we can also implement methods in interface.
		System.out.println("vehicle runs");
	}
}

class Car extends fare implements Vehicle{

	@Override
	public void starts() {
		// TODO Auto-generated method stub
		System.out.println("car starts");
	}

	@Override
	public void stops() {
		// TODO Auto-generated method stub
		System.out.println("car stops");
	}

	@Override
	public void tyres(int tyre) {
		// TODO Auto-generated method stub
		System.out.println("Car have " + tyre);
	}
	
//	public void run() {
//		System.out.println("car runs");
//	}
}

class fare{
	void fareMethod(){
		System.out.println("Fair method called");
	}
}

class bus extends fare{
	void busRun() {
		System.out.println("Bus running");
	}
}

public class LearningInterface {
	public static void main(String[] args) {
		Car car = new Car();
		car.starts(); car.stops(); car.tyres(4); car.run();
		System.out.println("car's a: " + car.a);
		
		Vehicle vehicle = new Car();
		vehicle.tyres(3);		
	}
}
