//David Humphries
//9/28/2023
//Exam1B
//This program shows a welcome message that takes user input, prints the length of the provided input, asks user to find character to find in the input, and show location of first character end

/**
 * 
 */

import java.util.Scanner;
/**
 * 
 */
public class Exam1B {

	
	/**
	 * @param <Scanner>
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to the Exam1B");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter text");
		Object scanner;
		String userInput=  keyboard.nextLine(); 
		System.out.println("Length of input"+userInput.length());
		System.out.println("Enter a character to find");
		char Character = keyboard.nextLine().charAt(0);
		int location = userInput.indexOf(Character);
		System.out.println("Location of the first occurance " + Character+ " is " + location);
		
		
		
		
	
	}

}
