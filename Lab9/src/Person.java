
public class Person {
	private String name;
	private String address;
	private long number;
	private int age;
	private String email;
	
	public Person() {
		name = null;
		address = null;
		number = 0;
		age = 0;
		email = null;
	}
	
	public Person(String n, String home, long phone, int old, String E) {
		name = n;
		address = home;
		number = phone;
		age = old;
		email = E;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person p1 = new Person("John", "123 45th St", 1234567890, 15, "asdfg@gmail.com");
		Student s1 = new Student("Nick", "134 23th St", 1235678942, 18, "dsadsad@yahoo.com", "sophomore");
		Employee e1 = new Employee("Derek", "1245 12th St", 1234569876, 20, "adsadv@hotmail.com", "1653 23th St", 120000, )
	}

}
