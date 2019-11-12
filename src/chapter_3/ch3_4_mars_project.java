package chapter_3;

public class ch3_4_mars_project {

	public static void main(String[] args) {
		double x = 5;
		System.out.println("recon " + x + " = " + recon(5));
		System.out.println("---------------");
		System.out.println("Airy-0 Crater to Ganges Chasma = " + distance(5,0,10,40));
		System.out.println("Ganges Chasma to Valles Marineris, a Martian Rift Zone = " + distance(10,40,10,70));
		System.out.println("Valles Marineris, a Martian Rift Zone to  Noctis Labyrinthus = " + distance(10,70,13,97));
		System.out.println("---------------");
		System.out.println("Total Trip: " + totalTrip(5,0,10,40,10,70,13,97));
		System.out.println("---------------");
		System.out.println("Round Trip: " + returnTrip(13,97,5,0));
		
	}
	
	public static double recon(double diameter) { 
		return diameter * Math.PI; 
	}

	public static double distance(int x1, int y1, int x2, int y2) { 
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); 
	}
	
	public static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
	    return distance(x1,y1,x2,y2) + distance(x2,y2,x3,y3) + distance(x3,y3,x4,y4);
	}

	public static double returnTrip(int x4, int y4, int x1, int y1) {
	    return distance(x4,y4,x1,y1);
	}

}
