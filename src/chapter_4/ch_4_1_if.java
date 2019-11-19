package chapter_4;

public class ch_4_1_if {

	public static void main(String[] args) {

		int currentScore = 10;
		int maxScore = 9;
		
		if (currentScore > maxScore) {
			System.out.println("A new high score!");
			maxScore = currentScore;
		}

	}

}
