import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		int[][] ticTacToe = {{3, 4, 5}, {6, 7, 9}, {10, 11, 12}};
		boolean win = false;
		for (int count = 1; count <= 9; count++) {
			System.out.print("Enter coordinates: ");
			Scanner input = new Scanner(System.in);
			int row = input.nextInt();
			int column = input.nextInt();
			if (count%2 == 0) {
				ticTacToe[row-1][column-1] = 1;
			} else {
				ticTacToe[row-1][column-1] = 0;
			}
			for (int i = 0; i < ticTacToe.length; i++) {
				for (int j = 0; j < ticTacToe[i].length; j++) {
					if (ticTacToe[i][j] == 1) {
						System.out.print("X" + "|");
					} else if (ticTacToe[i][j] == 0) {
						System.out.print("O" + "|");
					} else {
						System.out.print(" " + "|");
					}					
				}
				System.out.println();
				for (int k = 0; k < 3; k++) {
					System.out.print("- ");
				}
				System.out.println();
			}
			win = rowChecker(ticTacToe);
			if (win == true) {
				break;
			} else {
				win = columnChecker(ticTacToe);
				if (win == true) {
					break;
				} else {
					win = majorDiagonalChecker(ticTacToe);
					if (win == true) {
						break;
					} else {
						win = minorDiagonalChecker(ticTacToe);
						if (win == true) {
							break;
						} else {
							System.out.println("Unfinished");
						}
					}
				}
			}
			
		}
	}

	public static boolean rowChecker(int[][] m) {
		int zeroes, ones;
		boolean win = false;
		for (int i = 0; i < m.length; i++) {
			zeroes = 0;
			ones = 0;
			for (int e: m[i]) {
				if (e == 0) {
					zeroes += 1;
				} else if (e == 1) {
					ones += 1;
				}
			}
			if (zeroes == m.length) {
				System.out.println("Player 1 has won!");
				win = true;
			} else if (ones == m.length) {
				System.out.println("Player 2 has won!");
				win = true;
				
			}
		} return win;
	}
		
	public static boolean columnChecker(int[][] m) {
		int zeroes, ones;
		boolean win = false;
		for (int i = 0; i < m.length; i++) {
			zeroes = 0;
			ones = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 0) {
					zeroes += 1;
				} else if (m[j][i] == 1) {
					ones += 1;
				}
			}
			if (zeroes == m.length) {
				System.out.println("Player 1 has won!");
				win = true;
			} else if (ones == m.length) {
				System.out.println("Player 2 has won!");
				win = true;
			}
		} return win;
	}
	
	public static boolean majorDiagonalChecker(int[][] m) {
		int zeroes = 0, ones = 0;
		boolean win = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i][i] == 0) {
				zeroes += 1;
			} else if (m[i][i] == 1) {
				ones += 1;
			}
		}
		if (zeroes == m.length) {
			System.out.println("Player 1 has won!");
			win = true;
		} else if (ones == m.length) {
			System.out.println("Player 2 has won!");
			win = true;
		}
		return win;
	}
	
	public static boolean minorDiagonalChecker(int[][] m) {
		int zeroes, ones;
		boolean win = false;
		int i = m.length-1;
		zeroes = 0;
		ones = 0;
		for (int j = 0; j < m.length; j++) {
			if (m[i][j] == 0) {
				zeroes += 1;
			} else if (m[i][j] == 1) {
				ones += 1;
			} i--;
		} 
		if (zeroes == m.length) {
			System.out.println("Player 1 has won!");
			win = true;
		} else if (ones == m.length) {
			System.out.println("Player 2 has won!");
			win = true;
		}
		return win;
	}
	
}
