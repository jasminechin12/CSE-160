// Jasmine Chin 111717723

import java.util.Scanner;

public class AsteriskBoard {
	public static void checkboard(int n) {
		helper2(n, n);
	}
	
	public static void helper2(int row, int height) {
		if (height == 0) {			
		} else {
			helper1(row, height%2);
			System.out.println();
			helper2(row,height-1);
		}
	}
	
	public static void helper1(int n, int offset) {
		if (n == 0) {
		} else {
			if ((n+offset)%2 == 0) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			helper1(n-1, offset);
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		checkboard(n);
	}

}
