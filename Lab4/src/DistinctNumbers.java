import java.util.Scanner;

public class DistinctNumbers {
	
	public static boolean newNum(int[] numbers, int n) {
		for (int i : numbers) {
			if (n == i)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int index = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + numbers.length + " values: ");
		for (int i = 0; i < numbers.length; i++) { 
			int n = input.nextInt();
			if (newNum(numbers, n)) {
				numbers[index++] = n;
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
