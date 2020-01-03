package chapter_8;

public class Point {
	int x;
	int y;
	
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

