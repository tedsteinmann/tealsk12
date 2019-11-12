package chapter_2;

public class ch_2_Test_14 {

    public static void printStar() {
          System.out.println(" * ");
     }
    
     public static void loopStars() {
          for (int i = 0; i < 2; i++) {
	        for (int j = 1; j <= i; j++) {
	        	printStar();
	        }
	      }
     }

     public static void main (String[] args) {
          loopStars();
     } 

}