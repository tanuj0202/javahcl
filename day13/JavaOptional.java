package day13;

import java.util.Optional;

public class JavaOptional {
	public static void main(String[] args) {
		Student s = new Student("Tanuj");
//		Student s = new Student(null);
		String name = s.getName();
		Optional<String> name2 = Optional.of(s.getName()); //must contain not null value
		System.out.println(name2);
		name2.ifPresent(System.out::println);
		
		Optional<String> name3 = Optional.ofNullable(null);
//		Optional<String> name3 = Optional.ofNullable("methi");
	
		System.out.println(name3);
		System.out.println(name3.isPresent());
		System.out.println(name3.orElse("khandelwal"));
	
		System.out.println(name2.isPresent());
		
		
		//general method
		
//		User user = getUser();
//		if(user != null) {
//			Address a = user.address;
//			if(a != null) {
//				String city = a.city;
//				if(city != null) {
//					System.out.println("User city is: " + city);
//				} else {
//					System.out.println("City is null");
//				}
//			} else {
//				System.out.println("Adress is null");
//			}
//		} else {
//			System.out.println("User is null");
//		}
		
		//Optional Method
		Optional<User> user2 = getUser();
		user2.map(x -> x.address)
			.map(c -> c.city)
			.ifPresent(System.out::println);
	}
	
	static class User{
		public Address address;
	}
	static class Address{
		public String city;
	}

	private static Optional<User> getUser(){
		Address a = new Address();
		a.city = "Jaipur";
		
		User u = new User();
		u.address = a;
		
		return Optional.of(u);
	}
}


class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(String name) {
		this.name = name;
	}
}


