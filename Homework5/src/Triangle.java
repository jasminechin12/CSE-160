// Jasmine Chin 111717723

public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) throws Exception {
		
		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
			throw new IllegalTriangleException();
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	class IllegalTriangleException extends Exception {
		
	}

	public static void main(String[] args) {
		try {
			Triangle test = new Triangle(1,2,3);
		} catch (Exception ex) {
			System.out.print("Illegal Triangle");
		} 

	}

}
