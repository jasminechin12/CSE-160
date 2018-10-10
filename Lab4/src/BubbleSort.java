
public class BubbleSort {

	public static void main(String[] args) {
		double[] array = new double[] {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
	
	public static void bubbleSort(double[] list) {
		boolean changed = true;
		do {
			changed = false;
			for (int j = 0 ; j < list.length -1; j++) {
				double temp = 0;
				if(list[j]>list[j+1]) {
					temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
					changed = true;
				}
			}
		} while (changed);
		
	}
}
