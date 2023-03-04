package OOPExtends;

public class Cicle extends Shape{
	double radius = 1.0;

	public Cicle() {
		super();
	}
	
	public void Circle(double radius) {
		this.setRadius(radius);
	}

	public Cicle(String color, boolean filled, double radius) {
		super(color, filled);
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	} 
	
	public double Perimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return String.format("Cicle[%s,radius=%.2f",super.toString(),radius);
	}
	
}
