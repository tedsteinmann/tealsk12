package chapter_3;

public class ch3_0_string_objects {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "there";
		
		String combined = s1 + " " + s2;
		
		System.out.println("Length of combined: " + combined.length());
		
		System.out.println("Char at 5:" + combined.charAt(0));
		
		// write a for loop that prints chars in combined
		
		
		for (int i=0; i <combined.length(); i++) {
			System.out.println(i + ": " + combined.charAt(i));			
		}
		
		
		 System.out.println(combined.substring(0, 10));
		// System.out.println(combined.substring());
		
		
	}

}
