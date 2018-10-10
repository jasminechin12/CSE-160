// Jasmine Chin 111717723

import java.util.Scanner;

public class Reverse {
	public static void reverseDisplay(int value) {
		if (value < 10) {
			System.out.println(value);
		} else {
			System.out.print(value%10);
			reverseDisplay(value/10);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		reverseDisplay(num);
	}

}
