
public abstract class Vehicle implements Cloneable, Comparable{
	private int capacity;
	
	protected Vehicle() {
		
	}
	
	protected Vehicle(int cap) {
		capacity = cap;
	}
	
	public void start() {
		System.out.println("The vehicle has started");
	}
	
	public void stop() {
		System.out.println("The vehicle has stopped");
	}
	
	public void displayCapacity() {
		System.out.println("The vehicle's capacity is " + capacity);
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int n) {
		capacity = n;
	}
	
	public int compareTo(Object o) {
		if (capacity > ((Vehicle)o).capacity) {
			return 1;
		} else if (capacity < ((Vehicle)o).capacity) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	public boolean equals(Object o) {
		return (this == o);
	}
	
	public static void main(String[] args) {
		

	}

}

class Car extends Vehicle implements Cloneable, Comparable {
	private int capacity;
	
	public Car() {
		
	}
	
	public Car(int cap) {
		capacity = cap;
	}
	
	public void start() {
		System.out.println("The car has started");
	}
	
	public void stop() {
		System.out.println("The car has stopped");
	}
	
	public void displayCapacity() {
		System.out.println("The car's capacity is " + capacity);
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int n) {
		capacity = n;
	}
	
	public void honk() {
		System.out.println("The car can honk");
	}
	
	public int compareTo(Object o) {
		if (capacity > ((Car)o).capacity) {
			return 1;
		} else if (capacity < ((Car)o).capacity) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	public boolean equals(Object o) {
		if (o instanceof Car) {
			return capacity == ((Car)o).capacity;
		} else {
			return false;
		}
	}
}

class Plane extends Vehicle implements Cloneable, Comparable {
private int capacity;
	
	public Plane() {
		
	}
	
	public Plane(int cap) {
		capacity = cap;
	}
	
	public void start() {
		System.out.println("The plane has started");
	}
	
	public void stop() {
		System.out.println("The plane has stopped");
	}
	
	public void displayCapacity() {
		System.out.println("The plane's capacity is " + capacity);
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int n) {
		capacity = n;
	}
	
	public int compareTo(Object o) {
		if (capacity > ((Plane)o).capacity) {
			return 1;
		} else if (capacity < ((Plane)o).capacity) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	public boolean equals(Object o) {
		if (o instanceof Plane) {
			return capacity == ((Plane)o).capacity;
		} else {
			return false;
		}
	}
}

class Boat extends Vehicle {
private int capacity;
	
	public Boat() {
		
	}
	
	public Boat(int cap) {
		capacity = cap;
	}
	
	public void start() {
		System.out.println("The car has started");
	}
	
	public void stop() {
		System.out.println("The car has stopped");
	}
	
	public void displayCapacity() {
		System.out.println("The car's capacity is " + capacity);
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int n) {
		capacity = n;
	}
	
	public void floatOnWater() {
		System.out.println("The boat floats on water");
	}
	
	public int compareTo(Object o) {
		if (capacity > ((Boat)o).capacity) {
			return 1;
		} else if (capacity < ((Boat)o).capacity) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	public boolean equals(Object o) {
		if (o instanceof Boat) {
			return capacity == ((Boat)o).capacity;
		} else {
			return false;
		}
	}
}
