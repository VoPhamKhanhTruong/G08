package OOP;

public class Point {
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	/**
	 * Khoảng cách tới gốc tạo độ P(x,y)
	 * @param p Điểm cần tính khoảng cách 
	 * @return Khoảng cách d(.,P)
	 */
	
	public double Distance() {
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
		return d;
	}
	
	public double Distance(Point p) {
		double d = Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
		return d;
	}
	
	public static double Distance(Point a, Point b) {
//		double d = Math.sqrt(Math.pow(a.x-b.x, 2) + Math.pow(a.y-b.y, 2));
//		return d;
		return a.Distance(b);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", x,y);
	}
	
	
	
}
