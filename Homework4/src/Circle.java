// Jasmine Chin 111717723

public class Circle extends GeometricObject implements Comparable {
	private double radius;
	public Circle() { }
	public Circle(double radius) {
	this.radius = radius;
	}
	public double getRadius() {
	return radius;
	}
	public void setRadius(double radius) {
	this.radius = radius;
	}
	public double getArea() {
	return radius * radius * Math.PI;
	}
	public double getDiameter() {
	return 2 * radius;
	}
	public double getPerimeter() {
	return 2 * radius * Math.PI;
	}
	/* Print the circle info */
	public void printCircle() {
	System.out.println("The circle is created " + getDateCreated() +
	" and the radius is " + radius);
	}
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			return radius == ((Circle)o).radius;
		} else return false;
	}
	
	public int compareTo(Object o) {
		if (this.getRadius() == ((Circle)o).getRadius()) {
			return 0;
		} else return (int)(this.getRadius() - ((Circle)o).getRadius());
	}

}
