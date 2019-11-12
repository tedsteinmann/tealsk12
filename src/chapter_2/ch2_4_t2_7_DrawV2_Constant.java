package chapter_2;
public class ch2_4_t2_7_DrawV2_Constant {

	public static final int HEIGHT = 4;
	public static final int WIDTH = 3;
	
	public static void main(String[] args) {
		for (int line = 1; line <= HEIGHT; line ++) {
			goPackers();
			System.out.println();
		}
	}

	public static void goPackers() {
		for (int i = 1; i <= WIDTH; i++) {
			System.out.print("~ Go Packers ~");
		}

	}
		
}
