// Jasmine Chin 111717723

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class PrintCalendar {

	public static void main(String[] args) {
		System.out.print("Enter a year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print("Enter month as a number between 1 and 12: ");
		input = new Scanner(System.in);
		int month = input.nextInt(); 
		GregorianCalendar obj = new GregorianCalendar(year, month-1, 1);
		System.out.println("       " + obj.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " " + year);
		System.out.println("----------------------");
		System.out.println("SunMonTueWedThurFriSat");
		
		int daysinMonth = obj.getActualMaximum(Calendar.DAY_OF_MONTH);
		int start = obj.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 0; i < start-1; i++) {
			System.out.print("   ");
		}
		
		int j = start;
		for (int k = 0; k < daysinMonth; k++) {
			System.out.printf("%3d",k+1);
			if (j % 7 == 0) {
				System.out.println();
			}
			j++;
		}
	}

}
