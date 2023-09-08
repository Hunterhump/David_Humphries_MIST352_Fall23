//Author: David Humphries
//Class:MIST352-Fall23
//HW #1
//This program runs a print command string "Hi" and then runs the sum of int num1 and num2.
/**
 * 
 */

/**
 * 
 */
//should be named HW1A instead of HW 11.  Name of class should reflect class name.
public class HW1A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//added a semicolon in order to end string and correctly run program.
		System.out.println("Hi");
		
		int num1=10;
		
		double num2=5.5;
		
		char letter = 'A';
		// added double in front of sum as int cannot do decimals
		double sum= num1+num2;
		
		System.out.println("Sum:"+ sum);
	}

}
