
public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate hired;
	
	public Employee() {
		
	}
	
	public Employee(String n, String home, long phone, int old, String E, String location, double pay, MyDate datehired) {
		super(n, home, phone, old, E);
		office = location;
		salary = pay;
		hired = datehired;
	}
}
