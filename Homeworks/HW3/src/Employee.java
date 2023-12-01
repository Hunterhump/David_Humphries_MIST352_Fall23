import java.util.Date;
//David Humphries MIST 352 001 
public class Employee {
    private String name;
    private String dateOfBirth;
    private String role;
    private int employeeId;
    private String email;
    private double salary;
    private boolean aboveAvg ;
    private String bar;

    // Constructor 
    /**
     * You need to code this
     * This constructor accepts one line from a text file
     * It should split it up and initialize all attributes in this class using the values from the line
     * For example, name should equal to the first portion of the splited line and dateOfBirth is second and so on.
     * Lastly, set aboveAvg to false 
     * @param line
     */
    public Employee(String line)   		
    		 {
String[] dataParts = line.split(",");
this.name = dataParts[0];
this.dateOfBirth=dataParts[1];
this.role = dataParts[2];
this.employeeId = Integer.parseInt(dataParts[3]);
this.email = dataParts[4];
this.salary = Double.parseDouble(dataParts[5]);
this.aboveAvg = false;
this.bar= SalaryBarChart(this.salary);


        setAboveAvg(salary);
    }
    
    /**
     * You need to code this
     * This method accepts the average salary from the main and decide whether this employee's salary is above average or not
     * If it is, then set aboveAvg to true
     * @param intAverage
     */
   public void setAboveAvg(double dblAverage)
   {
	   if (salary > dblAverage) {
		   aboveAvg = true;
		   
	   }
	   
   }
	
   /**
	 * You need to code this.
	 * This method accepts an employee's salary and returns a bar chart of stars representation of the salary
	 * For example, 
	 * 				if the salary is 60,000, then the bar should return 6 stars:  ******
	 * 				if the salary is 95,600, then the bar should return 9 stars:  *********
	 * @param salary: the employee salary
	 * @return bar: representation in start of the salary. Each * represents $10,000
	 */
   public String SalaryBarChart(double salary) {
	   
				int stars = (int) (salary / 10000);
				for (int i = 0; i < stars; i++) { bar+= "*";
				
				}
	return bar;
	

	    	}
   
   /**
    * You need to code this.
    * This method provides a summary of each employee.
    * It returns a string formatted to include: employee name, employee ID, the bar chart of the salary, and whether salary is above average or not.
    * @return : Formatted string of employees basic information.
    */
   public String SummerizeEmployee()
	 
	 {
		String EmployeeSummary = " Name " + name + "\nID" + employeeId + "\nSalary Bar Chart: " + bar + "\nAbove Average: " + aboveAvg;
		
		return EmployeeSummary;
		
	 }
	 

}
