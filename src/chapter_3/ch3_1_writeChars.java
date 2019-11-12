package chapter_3;
public class ch3_1_writeChars {

	public static void main(String[] args) {
		writeChars('*',10);

	}
	
	public static void writeChars(char ch, int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(ch);
		}
	}
}
