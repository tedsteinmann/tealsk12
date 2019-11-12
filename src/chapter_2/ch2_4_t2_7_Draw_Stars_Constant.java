package chapter_2;

public class ch2_4_t2_7_Draw_Stars_Constant {

	public static final int HEIGHT = 11;
	public static final int WIDTH = 22;
	
	public static void main(String[] args) {
		for (int line = 1; line <= HEIGHT; line ++) {
			for (int i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (WIDTH - 2 * line); i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
