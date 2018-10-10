import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.print("Enter number of rows: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n ; i++) {
			for (int j = i; j > 0 ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
