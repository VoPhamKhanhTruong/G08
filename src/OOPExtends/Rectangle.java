package OOPExtends;

public class Rectangle extends Shape{
	private double width = 1.0;
	private double length = 1.0;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length,String color, boolean filled) {
		super();
		this.setWidth(width);
		this.setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return (width+length)*2;
	}

	@Override
	public String toString() {
		return String.format("Rectangle[%f,width=%f,length=%f]", super.toString(),width,length);
	}
	
}
