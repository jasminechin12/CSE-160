import java.util.Random;

public class TicTacToeBoard {

	public static void main(String[] args) {
		int[][] tttBoard = new int[3][3];
		Random randomInt = new Random();
		for (int i = 0; i < tttBoard.length; i++) {
			for (int j = 0; j < tttBoard[i].length; j++) {
				tttBoard[i][j] = randomInt.nextInt(2);
				System.out.print(tttBoard[i][j] + " ");
			}
			System.out.println();
		}
		rowChecker(tttBoard);
		columnChecker(tttBoard);
		majorDiagonalChecker(tttBoard);
		minorDiagonalChecker(tttBoard);
}

	public static void rowChecker(int[][] m) {
		int zeroes, ones;
		for (int i = 0; i < m.length; i++) {
			zeroes = 0;
			ones = 0;
			for (int e: m[i]) {
				if (e == 0) {
					zeroes += 1;
				} else {
					ones += 1;
				}
			}
			if (zeroes == m.length) {
				System.out.println("Row " + (i+1) + " has all zeroes");
			} else if (ones == m.length) {
				System.out.println("Row " + (i+1) + " has all ones");;
			}
		}
	}
		
	public static void columnChecker(int[][] m) {
		int zeroes, ones;
		for (int i = 0; i < m.length; i++) {
			zeroes = 0;
			ones = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 0) {
					zeroes += 1;
				} else {
					ones += 1;
				}
			}
			if (zeroes == m.length) {
				System.out.println("Column " + (i+1) + " has all zeroes");
			} else if (ones == m.length) {
				System.out.println("Column " + (i+1) + " has all ones");;
			}
		}
	}
	
	public static void majorDiagonalChecker(int[][] m) {
		int zeroes = 0, ones = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i][i] == 0) {
				zeroes += 1;
			} else {
				ones += 1;
			}
		}
		if (zeroes == m.length) {
			System.out.println("The major diagonal has all zeroes");
		} else if (ones == m.length) {
			System.out.println("The major diagonal has all ones");
		}
	}
	
	public static void minorDiagonalChecker(int[][] m) {
		int zeroes, ones;
		for (int i = m.length -1; i >= 0; i--) {
			zeroes = 0;
			ones = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == 0) {
					zeroes += 1;
					i--;
				} else {
					ones += 1;
					i--;
				}
			}
			if (zeroes == m.length) {
				System.out.println("The minor diagonal has all zeroes");
			} else if (ones == m.length) {
				System.out.println("The minor diagonal has all ones");
			}
		}
	}
	
}

