package chapter_3;

public class ch3_6_immutable_string {
	
	public static void main(String[] args) {
		String s = "Hello Maria";
		String t = s.toUpperCase(); //doesn't change the string
		System.out.println(t);
	}

}
