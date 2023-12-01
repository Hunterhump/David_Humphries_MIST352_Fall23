import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author David Humphries Mist 352 001
 *
 */
public class DataSummary {
	private String fileLocation;
	private double averageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return dblSum: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	public double getAverage() throws FileNotFoundException
	{
	File file = new File(fileLocation);
	Scanner inputfile = new Scanner(file);
	//opens file
	double TotalSalary = 0;
	int totalEmployees = 0;
	while(inputfile.hasNext())
		
	{
		String strData2Show = inputfile.nextLine();
		String[] dataParts = strData2Show.split(",");
		String strSalary = dataParts[5];
		double Salary = Double.parseDouble(strSalary);
		//converts data into a number to use
		TotalSalary += Salary;
		//sum of salaries for each individual
		
		totalEmployees ++;
		
		
		
		
	}
	inputfile.close();
	
	averageSalary = TotalSalary / totalEmployees;
	//solves the average
	return averageSalary;
	
	}
	

	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeAndIDs() throws FileNotFoundException
	{
		File data = new File(fileLocation);
		//opens file
		Scanner scnReader = new Scanner(data);
		//reads data
		while(scnReader.hasNext()) {
			System.out.println(scnReader.next());
			//prints out data 
		}
		
		scnReader.close();
		
	}
	
	
	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void SearchEmployee(String strEmployee) throws FileNotFoundException
	{
		 File file = new File(fileLocation);
		 //opens file
		 Scanner input = new Scanner(file);
		 //reads data
		 String enterEmployeeName;
		 System.out.println("Enter Employee Name: ");
		 Scanner keyboard = new Scanner(System.in);
		 //asks user for name
		 enterEmployeeName = keyboard.nextLine();
		 
		 boolean employeeFound = false;
		 
		 while(input.hasNextLine()) {
			 String strData2Show = input.nextLine();
			 String[] dataParts =strData2Show.split(",");
			 //reads data and separates it by commas
			 String employeeName = dataParts[0];
			 if (employeeName.equalsIgnoreCase(enterEmployeeName));
			 JOptionPane.showMessageDialog(null, "Employee role: /n" + strData2Show);
			 employeeFound = true;
			 
			 
		 }
		 input.close();
		 

		
	}
	
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException
	{
		File file = new File(fileLocation);
		//opens file
		Scanner input = new Scanner(file);
		//reads file
		boolean employeeRoleFound = false;
		
		while (input.hasNextLine());
		String strData2Show = input.nextLine();
		String[] dataParts = strData2Show.split(",");
		 //reads data and separates it by commas
		String employeeRole = dataParts[2];
		
		if (employeeRole.equalsIgnoreCase(strRole)) {
			JOptionPane.showMessageDialog(null, "Employee role: /n" + strData2Show);
			employeeRoleFound = true;
			
		}
				input.close();
				if (employeeRoleFound == false) {
					JOptionPane.showMessageDialog(null, "No employee found for role");
				}

		
	}
	

	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	
}
