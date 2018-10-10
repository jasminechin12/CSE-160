import java.util.Calendar;

public class MyDate {
	private int year, month, day;
	
	public MyDate() {
		Calendar calendar = Calendar.getInstance();
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(int yr, int mth, int dy) {
		year = yr;
		month = mth;
		day = dy;
	}
	
	public int getYear() {
		return year;
	}
	
	public int setYear(int givenyr) {
		return year = givenyr;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int setMonth(int givenmth) {
		return month = givenmth;
	}
	
	public int getDay() {
		return day;
	}
	
	public int setDay(int givenday) {
		return day = givenday;
	}
	
	public String toString() {
		return "Year: " + year + " Month: " + month + " Day: " + day;
	}

	public static void main(String[] args) {
		MyDate test1 = new MyDate();
		MyDate test2 = new MyDate(2015, 2, 25);
		System.out.println(test1);
		System.out.println(test2);
		test1.setYear(2001);
		test1.setMonth(6);
		test1.setDay(13);
		System.out.println(test1);
	}

}
