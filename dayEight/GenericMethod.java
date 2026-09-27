package dayEight;


public class GenericMethod {
	// in this alphabet at both place should be same.
	static <X> String genericDisplay(X element) {
		return element.getClass().getName() + " " + element;
	}
	
	static <B,H> Boolean same(B ele, H ment) {
		return ele.getClass().getName().equals(ment.getClass().getName());
	}
	
	public static void main(String[] args) {
		System.out.println(genericDisplay(45));
		System.out.println(genericDisplay("tanuj"));
		System.out.println(genericDisplay(1.0));
		System.out.println(genericDisplay(false));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first input: ");
		System.out.println("-------same----------");
		System.out.println(same(45, "tanuj"));
		System.out.println(same(45, 45));

		System.out.println("-------POJO with Generics----------");
		Box<Integer> obj = new Box<>();
		obj.setValue(45);
		System.out.println(obj.getValue());
	}
}

// pojo class with generic
class Box<S>{
	S value;
	
	void setValue(S value) {
		this.value = value;
	}
	
	S getValue() {
		return value;
	}
}
