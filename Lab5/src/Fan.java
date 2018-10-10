
public class Fan {
	private int slow = 1, medium = 2, fast = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan() {
		this.speed = slow;
		this.on = false;
		this.radius = 5;
		this.color = "blue";	
	}

	public Fan(int speed, boolean on, double radius, String color){
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public int setSpeed(int newSpeed) {
		speed = newSpeed;
		return speed;
	}
	
	public boolean setOn(boolean newOn) {
		on = newOn;
		return on;
	}
	
	public double setRadius(double newRadius) {
		radius = newRadius;
		return radius;
	}
	
	public String setColor(String newColor) {
		color = newColor;
		return color;
	}
	
	public String toString() {
		if (on == true) {
			return ("The speed is " + speed + ", color is " + color + " and radius is " + radius);
		} else {
			return ("The color is " + color + " and radius is " + radius + " and fan is off");
		}
	}

	public static void main(String[] args) {
		/*
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.speed = 3;
		fan1.radius = 10;
		fan1.color = "yellow";
		fan1.on = true;
		fan2.speed = 2;
		fan2.radius = 5;
		fan2.color = "blue";
		fan2.on = false;
		*/
		Fan fan1 = new Fan(3, true, 10, "yellow");
		Fan fan2 = new Fan(2, false, 5, "blue");
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}
