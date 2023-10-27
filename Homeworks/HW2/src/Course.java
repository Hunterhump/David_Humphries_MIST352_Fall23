
public class Course {
//create attributes
	private String courseCode;
	private String courseTitle;
	private String instructorName;
	private int maximumCapacity; 
	private int currentEnrollment;
	
	//Constructor1
	public Course (String courseCode, String courseTitle, String instructorName) {
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.instructorName = instructorName;
		maximumCapacity = 30;
		currentEnrollment = 29;
		
	}
	//create method
	public void setcourseCode(String thecourseCode)
	{ this.courseCode = thecourseCode;
	
	}
	
	public void setcourseTitle(String thecourseTitle)
	{this.courseTitle = thecourseTitle;
	
	}
	
	public void setinstructorName(String theinstructorName)
	{this.instructorName = theinstructorName;
	
	}
	
	public void setMaximumCapacity(int capacity)
	{this.maximumCapacity= capacity;
	
	}
	
	public void setCurrentEnrollment(int enrollment)
	{this.currentEnrollment= enrollment;
	
	}
	
	public String getcourseCode()
	{return courseCode;
	
	}
	
	public String getcourseTitle()
	{return courseTitle;
	
	}
	
	public String getinstructorName()
	{return instructorName;
	
	}
	
	public int getMaximumCapacity()
	{return maximumCapacity;
	
	}
	
	public int getCurrentEnrollment()
	{return currentEnrollment;
	
	}
	
	//create method to see if there is space in class or not
	public boolean enrollStudent()
	{if (currentEnrollment < maximumCapacity) {
		currentEnrollment++;
		return true;
	} else { return false;}

	}
	
	
}
