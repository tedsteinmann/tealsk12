package chapter_2;
public class FishInAStream {

	public static final int WIDTH = 3;
	public static final int HEIGHT = 4;


	public static void drawWaterAndFish() {
		for (int i = 1; i <= WIDTH; i++) {
			System.out.print("¸.·´¯`·.¸¸ ><((((º>");
		}

	}	
	
	public static void main(String[] args) {
		for (int line = 1; line <= HEIGHT; line ++) {
			for (int i = 1; i <= WIDTH; i++) {
				drawWaterAndFish();
			}	
			System.out.println();
		}

	}		
}
