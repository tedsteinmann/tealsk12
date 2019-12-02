package chapter_3;
/****
 * This program is designed to:
 * 1. Accepts as user input, a string of numbers
 * 2. Prints the largest and smallest of all the numbers supplied
 * 3. Print the sum of all the even numbers the user typed, 
 * 		along with the largest even number typed.
 */

import java.util.*;


public class ws3_12_ProcessingNumbersAsArray {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");

		int numNumbers = console.nextInt();
		
		int[] numbers = new int[numNumbers];
		
		for (int i = 0; i < numNumbers; i++) {
		    numbers[i] = console.nextInt();
		}
		
		int largestNumber = numbers[0];
		int smallestNumber = numbers[0];
		int sumEvenNumber = 0;

		for (int i = 0; i < numNumbers; i++) {
			
			//find the smallest number
			if(numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
			//find the largest number
			if(numbers[i] > largestNumber) {
				largestNumber = numbers[i];
			}
			
			//sum even numbers
			if((numbers[i] % 2) == 0) {
				sumEvenNumber = sumEvenNumber + numbers[i];
			}
			
		}
		
		System.out.println("Smallest Number: " + smallestNumber);
		System.out.println("Largest Number: " + largestNumber);
		System.out.println("Sum of even Numbers: " + sumEvenNumber);
		
		}
		
}
