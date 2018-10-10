// Jasmine Chin 111717723

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	protected GeometricObject() {
	dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) {
	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
	}
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	public boolean isFilled() { return filled; }
	public void setFilled(boolean filled) { this.filled = filled; }
	public java.util.Date getDateCreated() { return dateCreated; }
	public String toString() {
	return "created on " + dateCreated + "\ncolor: " + color +
	" and filled: " + filled;
	}
	/** Abstract method getArea */
	public abstract double getArea();
	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(6);
		if (c1.compareTo(c2) == 0) {
			System.out.println("c1 is equal to c2: true");
		} else {
			System.out.println("c1 is not equal to c2");
		}
		if (c2.compareTo(c3) == 0) {
			System.out.println("c2 is equal to c3: true");
		} else {
			System.out.println("c2 is not equal to c3");
		}
		System.out.println("c1 is equal to c2: " + c1.equals(c2));
		System.out.println("c2 is equal to c3: " +c2.equals(c3));
	}

}
