package chapter_2;

public class Average_Population {

	public static void main(String[] args) {

		int populationOfNewYork = 8406741;
		int populationOfChicago = 2719395;
		int populationOfBoston = 645961;
		int populationOfSantoDomingo = 2907808;

		int numberOfCities = 4;

		/* compute average population */
		double average =((populationOfNewYork 
						+ populationOfChicago
						+ populationOfBoston
						+ populationOfSantoDomingo)
						/ numberOfCities);

		
		
		System.out.println("The average population is " + average);


	}


}
