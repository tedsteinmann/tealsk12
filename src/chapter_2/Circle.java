package chapter_2;

public class Circle {

	public static final double pi = 3.14;
	
	public static void main(String[] args) {
		double radius = 7.5;
		
		double permiter = 2 * pi * radius;
		double area = pi * radius * radius;
		
		System.out.println("Permiter is = " + permiter);
		System.out.println("Area is = " + area);

	}

}
