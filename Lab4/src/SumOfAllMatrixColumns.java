import java.util.Scanner;

public class SumOfAllMatrixColumns {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter an integer, n, for dimension of n x n matrix: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.print("Enter the matrix in a single line (each element separated by a space): ");
		input = new Scanner(System.in);
		double[][] matrix = new double[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("The sum of the numbers in column " + (i+1) + " is " + sumColumns(matrix, i));
		}
	}

	public static double sumColumns(double[][]m, int c) {
		double total = 0;
		for (int i = 0; i < m.length; i++) {
			total += m[i][c];
		}
		return total;
	}
	
}
