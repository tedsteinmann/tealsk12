//Console Input: Responses typed by the user

package chapter_3;
import java.util.*; //for Scanner

public class ch3_6_console_input {

	public static void main(String[] args) {
	// In Java, constructors are called
	// using the special keyword "new"
	Scanner console = new Scanner(System.in);
	
	System.out.print("Input: ");
	
	//Scanner Methods
	//-----------------
	//nextDouble()	Reads and returns a "double" value
	//double console_input = console.nextDouble();
	//nextInt()		Reads and returns an "int" value
	// int console_input = console.nextInt();
	//next()		Reads and returns the next token as a "String"
	// String console_input = console.next();
	//nextLine()	Reads and returns the next line of input as a "String"	
	String console_input = console.nextLine();
	
	System.out.print("You entered: ");
	System.out.println(console_input);
	

	}

}
