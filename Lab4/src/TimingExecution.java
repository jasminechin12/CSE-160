import java.util.Arrays;

public class TimingExecution {	

	public static void main(String[] args) {
		int[] randomInts = new int[100000];
		
		for(int i = 0; i < randomInts.length; i++) {
			randomInts[i] = (int)(Math.random()*100);
		}
		
		int randomIndex = (int)(Math.random()*100000);
		int key = randomInts[randomIndex];
		
		long startTimeofLin = System.currentTimeMillis();
		
		int i = linearSearch(randomInts, key);
		
		long endTimeofLin = System.currentTimeMillis();
		long executionTimeofLin = endTimeofLin - startTimeofLin;
		
		System.out.println("The index is " + i);
		System.out.println("Execution time of Linear Search is " + executionTimeofLin + " milliseconds");
		
		java.util.Arrays.sort(randomInts);
		
		long startTimeofBin = System.currentTimeMillis();
		
		int j = java.util.Arrays.binarySearch(randomInts, key);
				
		long endTimeofBin = System.currentTimeMillis();
		long executionTimeofBin = endTimeofBin - startTimeofBin;
		
		System.out.println("The index is " + j);
		System.out.println("Execution time of Binary Search is " + executionTimeofBin + " milliseconds");
	}
	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
	
}
