package chapter_3;
/****
 * This program is designed to:
 * 1. Accepts as user input, a string of numbers
 * 2. Prints the largest and smallest of all the numbers supplied
 * 3. Print the sum of all the even numbers the user typed, 
 * 		along with the largest even number typed.
 */

import java.util.*;


public class ws3_12_ProcessingNumbers {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a string of numbers:");
		
		// Accept user input as a string of numbers
		String numbers = console.nextLine();

		int firstNumber = Character.getNumericValue(numbers.charAt(0));		
		
		int largestNumber = firstNumber;
		int smallestNumber = firstNumber;
		int sumEvenNumber = 0;

		for (int i = 0; i < numbers.length(); i++) {

			int currentNumber = Character.getNumericValue(numbers.charAt(i));
			
			//find the smallest number
			if(currentNumber < smallestNumber) {
				smallestNumber = currentNumber;
			}
			//find the largest number
			if(currentNumber > largestNumber) {
				largestNumber = currentNumber;
			}
			
			//sum even numbers
			if((currentNumber % 2) == 0) {
				sumEvenNumber = sumEvenNumber + currentNumber;
			}
			
		}
		
		System.out.println("Smallest Number: " + smallestNumber);
		System.out.println("Largest Number: " + largestNumber);
		System.out.println("Sum of even Numbers: " + sumEvenNumber);
		
		}
		
}
