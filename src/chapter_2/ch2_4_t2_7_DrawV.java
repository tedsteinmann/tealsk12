package chapter_2;

public class ch2_4_t2_7_DrawV {

	public static void main(String[] args) {
		for (int line = 1; line <= 5; line ++) {
			for (int i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (11 - 2 * line); i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
