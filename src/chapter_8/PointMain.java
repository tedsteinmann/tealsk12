package chapter_8;

public class PointMain {

	public static void main(String[] args) {

		
		Point p1 = new Point(7, 2);		
		// Point p2 = new Point(4,3);
		
		System.out.println("p1 coordinates: " + p1.getX() + ","  + p1.getY());
		System.out.println("p1 distance from origin: " + p1.distanceFromOrigin());
		
		//modify the x and y coordinates
		//p2.x += 2;
		//p2.y++;
		
		//System.out.println("p2 coordinates: " + p2.x + ","  + p2.y);
		//System.out.println("p1 distance from origin: " + p2.distanceFromOrigin());

		
		
		
	}

}
