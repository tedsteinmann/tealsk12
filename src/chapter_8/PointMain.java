package chapter_8;

public class PointMain {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.x = 7;
		p1.y = 2;
		
		Point p2 = new Point();
		p2.x = 4;
		p2.y = 3;
		
		System.out.println("p1 coordinates: " + p1.x + ","  + p1.y);
		System.out.println("p1 distance from origin: " + p1.distanceFromOrigin());
		
		//modify the x and y coordinates
		//p2.x += 2;
		//p2.y++;
		
		//System.out.println("p2 coordinates: " + p2.x + ","  + p2.y);
		//System.out.println("p1 distance from origin: " + p2.distanceFromOrigin());

		
		
		
	}

}
