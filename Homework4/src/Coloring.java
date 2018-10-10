// Jasmine Chin 111717723

public class Coloring {

	public static void main(String[] args) {
		GeometricObject[] shapes = new GeometricObject[5];
		shapes[0] = new Circle();
		shapes[1] = new Circle(5);
		shapes[2] = new Square();
		shapes[3] = new Square(10, "black", false);
		shapes[4] = new Rectangle(5, 10, "blue", true);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Shape " + (i + 1) + " has the area " + shapes[i].getArea() + " and the perimeter " + shapes[i].getPerimeter());
			if (shapes[i] instanceof Colorable) {
				System.out.println("How to color: " + ((Colorable)shapes[i]).howToColor());
			}
		}
}

static class Square extends GeometricObject implements Colorable {
	private double side;
	public Square() {
		this.side = 5;
	}
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double getArea() {
		return side*side;
	}
	@Override
	public double getPerimeter() {
		return side*4;
	}
	public String howToColor() {
		return "Color all four sides";
	}
}

static class Rectangle extends GeometricObject implements Colorable {
	private double width;
	private double height;
	public Rectangle() {
		this.height = 10;
		this.width = 5;
	}
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height;
	}
	@Override
	public double getPerimeter() {
		return 2* (width+height);
	}
	public String howToColor() {
		return "Color all four sides";
	}
}

interface Colorable {
	String howToColor();
}
}