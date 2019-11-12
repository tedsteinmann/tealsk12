package chapter_3;

public class ch3_1_drawTop {

	public static final int SUB_HEIGHT = 5;
	
	public static void main(String[] args) {
		drawTop();
	}

	public static void drawTop() {
		for (int line = 1; line <= SUB_HEIGHT; line ++) {
			
			writeChars(' ', line - 1);
			System.out.print("\\");
			
			writeChars('*', 2 * SUB_HEIGHT - 2 * line);
			System.out.print("/");
			
			writeChars(' ', line - 1);
			System.out.println();
		}
	}
		
	public static void writeChars(char ch, int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(ch);
		}
	}
	
}
