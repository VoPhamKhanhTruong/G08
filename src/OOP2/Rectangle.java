package OOP2;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {
		
	}
	
	public Rectangle(float length, float width) {
		this.setWidth(width);
		this.setLength(length);
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return width * length;
	}
	
	public double getPerimeter() {
		return (width + length) * 2;
	}
	
	public String toString() {
		return "Area Rectangle = " + this.getPerimeter() + "\n" + "Perimeter Rectangle = " + this.getArea();
	}
}
