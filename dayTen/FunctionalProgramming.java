package dayTen;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalProgramming {
	public static void main(String[] args) {
		System.out.println("=================Predicate================");
		Predicate<Integer> checkEven = (number) -> number % 2 == 0;
		
		System.out.println(checkEven.test(6));
		System.out.println(checkEven.test(7));
		
		System.out.println("=================Function================");
		Function<Integer, Integer> square = number -> number * number;
		System.out.println(square.apply(3));
		System.out.println(square.apply(9));

 		System.out.println("=================Consumer================");
		Consumer<String> consumer = name -> System.out.println(name);
		consumer.accept("Tanuj Methi");
		
		System.out.println("=================Supplier================");
		Supplier<String> message = () -> "Welcome to Java Programming";
		System.out.println(message.get());
	}
}

@FunctionalInterface
interface Calculator{
	int calculate(int a, int b);
}
