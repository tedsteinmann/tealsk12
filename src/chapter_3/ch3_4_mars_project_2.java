package chapter_3;

public class ch3_4_mars_project_2 {

	public static void main(String[] args) {
		
		String location1 = "Airy-0 Crater";
		int x1 = 5, y1 = 0;
		
		String location2 = "Ganges Chasma";
		int x2 = 10, y2 = 40;		

		String location3 = "Valles Marineris, a Martian Rift Zone";
		int x3 = 10, y3 = 70;
		
		String location4 = "Noctis Labyrinthus";
		int x4 = 13, y4 = 97;
		
		// Ex1: recon
		System.out.println("Recon distance = " + recon(5));
		// --- calculate distances ---
		System.out.println("Distance from " + location1 + " to " + location2 + ": " + distance(x1,y1,x2,y2));
		System.out.println("Distance from " + location2 + " to " + location3 + ": " + distance(x2,y2,x3,y3));
		System.out.println("Distance from " + location3 + " to " + location4 + ": " + distance(x3,y3,x4,y4));
		// --- calculate total trip ---
		System.out.println("Total Trip: " + totalTrip(5,0,10,40,10,70,13,97));
	
	
	}
	
	// Exercise 1
	public static double recon(double diameter) {
		
		return diameter * Math.PI;

	}
	
	//Exercise 2: Write a method called distance
	public static double distance(int x1, int y1, int x2, int y2) {
		
		double distance = 0;
		
		distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow((y2 -y1),2));
		
		
		return distance;
	}

	//  totalTrip accepts parameters for 3 locations eturns the total distance traveled
	public static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		double totalTrip = 0;
		
		totalTrip = distance(x1,y1,x2,y2) + distance(x2,y2,x3,y3) + distance(x3,y3,x4,y4);
		
		return totalTrip;
		
	}

}
