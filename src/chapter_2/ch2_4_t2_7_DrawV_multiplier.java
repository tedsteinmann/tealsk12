package chapter_2;

public class ch2_4_t2_7_DrawV_multiplier {
	
	public static final int MULTIPLIER = 21;

	public static void main(String[] args) {
		for (int line = 1; line <= (MULTIPLIER / 2); line ++) {
			for (int i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (MULTIPLIER - 2 * line); i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
