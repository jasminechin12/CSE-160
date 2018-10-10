
public class Rectangle {
	private double height, width;
	private String color;
	
	public Rectangle() {
		this.height = 1;
		this.width = 1;
		this.color = "white";
	}
	
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getColor() {
		return color;
	}
	
	public double setWidth(double newWidth){
		width = newWidth;
		return width;
	}

	public double setHeight(double newHeight){
		height = newHeight;
		return height;
	}
	
	public String setColor(String newColor){
		color = newColor;
		return color;
	}
	
	public double getArea() {
		return (width*height);
	}
	
	public double getPerimeter() {
		return (2*width + 2*height);
	}
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		rec1.setColor("red");
		rec2.setColor("red");
		System.out.println("The width of rectangle 1 is " + rec1.width);
		System.out.println("The height of rectangle 1 is " + rec1.height);
		System.out.println("The color of rectangle 1 is " + rec1.getColor());
		System.out.println("The area of rectangle 1 is " + rec1.getArea());
		System.out.println("The perimeter of rectange 1 is " + rec1.getPerimeter());
		System.out.println();
		System.out.println("The width of rectangle 2 is " + rec2.width);
		System.out.println("The height of rectangle 2 is " + rec2.height);
		System.out.println("The color of rectangle 2 is " + rec2.getColor());
		System.out.println("The area of rectangle 2 is " + rec2.getArea());
		System.out.println("The perimeter of rectangle 2 is " + rec2.getPerimeter());
	}
}
