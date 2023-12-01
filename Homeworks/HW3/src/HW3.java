/**
 * 
 */

/**
 * @author David Humphries MIST 352 001
 *USED CHAT GPT
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class HW3 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
	//****** Keep as is *******************
		// The location of the employee text file 
		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation);
	//*************************************

		
		while (intChoice != 0) {
		    switch (intChoice) {
		        case 1:
		            // View Employees and IDs
		            try {
		                myData.ViewEmployeeAndIDs();
		            } catch (FileNotFoundException e) {
		                e.printStackTrace();
		            }
		            break;

		        case 2:
		            // Search for Employee
		            String searchEmployeeName = JOptionPane.showInputDialog(null, "Enter Employee Name:");
		            try {
		                myData.SearchEmployee(searchEmployeeName);
		            } catch (FileNotFoundException e) {
		                e.printStackTrace();
		            }
		            break;

		        case 3:
		            // View current roles
		            try {
		                myData.ViewRoles();
		            } catch (FileNotFoundException e) {
		                e.printStackTrace();
		            }
		            break;

		        case 4:
		            // View employees for a certain role
		            String viewRole = JOptionPane.showInputDialog(null, "Enter Employee Role:");
		            try {
		                myData.ViewEmployeeForRole(viewRole);
		            } catch (FileNotFoundException e) {
		                e.printStackTrace();
		            }
		            break;

		        case 5:
		            // View Average Salary
		            try {
		                JOptionPane.showMessageDialog(null, "Average Salary: " + myData.getAverage());
		            } catch (FileNotFoundException e) {
		                e.printStackTrace();
		            }
		            break;

		        case 6:
		            // Summarize and Write data
		            while (inputFile.hasNextLine()) {
		            	String line = inputFile.nextLine();
		            	Employee employee = new Employee(line);
		            	writer.println(employee.SummerizeEmployee());
		            	
		            }
		            break;

		        case 0:
		            // Exit
		            break;

		        default:
		            JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
		            break;
		    }

		    intChoice = Integer.parseInt(JOptionPane.showInputDialog(null, ViewOptions()));
		}



		writer.close();
		inputFile.close();	
		
	}
	/**	 
	 * Keep as is
	 * A method to display options
	 * @return : The options to display in the GUI
	 */
	
	public static String ViewOptions()
	{
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	} }
	
	
	
	



