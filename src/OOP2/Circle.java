package OOP2;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
		radius = 1;
		color = "red";
	}
	
	public Circle(double r) {
		this.radius = r;
		color = "red";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius() {
		
	}

	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public String toString() {
		return toString();
	}
}
