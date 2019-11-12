package chapter_3;

public class ch3_3_math_example {

	public static void main(String[] args) {
		System.out.println("PI = " + Math.PI);
		
		// calculate circumference of circle
		double diameter = 5;
		double circum = circum(diameter);
		
		System.out.println("Circumference = " + circum);		
		
		System.out.println("Sqrt = " + Math.sqrt(circum));
		

	}

	public static double circum(double diameter) { 
		return diameter * Math.PI; 
	}

}
