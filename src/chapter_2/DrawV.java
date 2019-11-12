package chapter_2;

public class DrawV {

	public static void main(String[] args) {
		//for (lines 1 through 5) \
		for (int line = 1; line <= 5; line++)		{
		    //write (line - 1) spaces
			for(int j = 1; j <= (line -1);j++) {
				System.out.print(" ");
			}
		    //write (11 – 2 * line) asterisks
			for(int i = 1; i <= (11 - 2 * line); i++) {
				System.out.print("*");
			}
		    //go to a new line
			System.out.println();
		}


	}

}
