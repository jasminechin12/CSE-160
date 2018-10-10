import java.util.Scanner;

public class SumOfMatrixColumns {

	public static void main(String[] args) {
		int n, column;
		System.out.print("Enter an integer for size of matrix: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.print("Enter an n x n matrix (in a single line with each element separated by a space): ");
		input = new Scanner(System.in);
		double[][] matrix = new double[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter the column number you wish to get the total of: ");
		input = new Scanner(System.in);
		column = input.nextInt();
		System.out.println("The sum of all the numbers in column " + column + " is " + sumColumn(matrix, column - 1));
		
		}

	public static double sumColumn(double[][]m, int c) {
		double total = 0;
		for (int i = 0; i < m.length; i++) {
			total += m[i][c];
		}
		return total;
	}
}
