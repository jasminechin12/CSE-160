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
	Triangle test1 = new Triangle(1, 1.5, 1);
	test1.setColor("yellow");
	test1.setFilled(true);
	System.out.println("Area: " + test1.getArea() + " Perimeter: " + test1.getPerimeter());
	System.out.print(test1);
}
}