package chapter_1;

public class ch_1_draw_figures {

	public static void main(String[] args) {
		drawRocket();
	}
	
	public static void drawRocket() {
		drawCone();
		drawBox();
		drawLabel();
		drawBox();
		drawCone();
	}
	
	
	public static void drawCone() {
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
	}
	
	public static void drawBox() {
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	
	public static void drawLabel() {
		System.out.println("|United|");
		System.out.println("|States|");
	}

}
