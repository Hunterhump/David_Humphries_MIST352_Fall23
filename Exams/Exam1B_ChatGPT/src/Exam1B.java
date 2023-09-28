/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class Exam1B {
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("Welcome to the Exam1B Program!");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for text input
        System.out.print("Please enter some text: ");
        String userInput = scanner.nextLine();

        // Printout the length of the provided input
        int inputLength = userInput.length();
        System.out.println("The length of the input is: " + inputLength);

        // Ask user for a character to find in the input
        System.out.print("Please enter a character to find in the input: ");
        char charToFind = scanner.nextLine().charAt(0);

        // Printout the location of the first occurrence of that character
        int charIndex = userInput.indexOf(charToFind);
        System.out.println("The location of the first occurrence of '" + charToFind + "' is: " + charIndex);

        // Close the scanner
        scanner.close();
    }
}
