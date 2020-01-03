package chapter_8;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// return the distance between "this" point and (0,0)
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y *y);
	}
	
	// modify the x and y coordinates
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
}

