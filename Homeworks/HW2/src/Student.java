/**
 * 
 */

/**
 * @author David humphries
 *
 */
public class Student 
{
private String name;
private int id;
private String major;
private String dob;
private int hours;

// Constructor1
public Student(String name) { this.name = name;
}

//Constructor2
public Student() {
	this.name = "Not Provided";
	
}
//create methods
public void setname(String theName)
{this.name = theName; 

}

public void setid(int theID)
{this.id = theID;

}

public void setmajor(String theMajor)
{this.major = theMajor;

}

public void setdob(String theDOB)
{this.dob = theDOB;

}

public void sethours (int hours, String action)
{this.hours = hours;

}

public String getName()
{return name;

}

public int getID()
{return id;

}

public String theMajor (String getMajor)
{return major;

}

public String getDOB()
{ return dob;
}

public int getHours()
{return hours;
}
}

