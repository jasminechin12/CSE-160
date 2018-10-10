
public class Student extends Person {
	private String status;
	
	public Student() {
		
	}
	
	public Student(String n, String home, long phone, int old, String E, String stat) {
		super(n, home, phone, old, E);
		status = stat;
	}
	
}
