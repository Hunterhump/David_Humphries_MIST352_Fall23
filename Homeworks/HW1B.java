//Author: David Humphries
//Class:MIST352-Fall23
//HW #1
//This program runs a print command string "Hi" and then runs the sum of int num1 and num2.
/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
//should be named HW1A instead of HW 11.  Name of class should reflect class name.
public class HW1B{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//added a semicolon in order to end string and correctly run program.
		System.out.println("Hi");
		
		System.out.println("Enter value for num1");
		
		Scanner Keyboard = new Scanner (System.in);
//assign input to variable
		int num1 = Keyboard.nextInt();
		
		System.out.println("Enter value for num2");
		//assign input to variable
		double num2 = Keyboard.nextDouble();
	//removed char letter "A" as it is not relevant here
		// added double in front of sum as int cannot do decimals


double sum= num1+num2;
		
		System.out.println("Sum:"+ sum);
	}

}
