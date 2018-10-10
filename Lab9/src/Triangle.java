
public class Triangle extends GeometricObject {
	private double side1, side2, side3;
	
	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	public Triangle(double value1, double value2, double value3) {
		side1 = value1;
		side2 = value2;
		side3 = value3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double p = (side1 + side2 + side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return super.toString();
	}
}
