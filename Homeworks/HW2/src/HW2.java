/**
 * 
 */

/**
 * @author David humphries
 *
 */
public class HW2 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Course course1 = new Course("MIST352", "Businsess Application Programming","MJ Ahmad");
		Course course2 = new Course("CS101", "Introd. to Computer Science","Sarah Jones");
		Student student1 = new Student("Ashley Jaber");
		Student student2 = new Student("Ali June");
		TestScores grade1 = new TestScores(90, 82, 82);
		TestScores grade2 = new TestScores(78, 83, 86); 
		
		
		
				
		
		
		//Keep If statements the way they are.
		if (course1.enrollStudent()) 
			{
			System.out.println(" Enrolling " + student1.getName() + " in " +course1.getcourseCode() + " successfull ");
			System.out.println(" Current enrollment " + course1.getCurrentEnrollment());
			System.out.println(" The current GPA is: " + grade1.getAverageScore());
			}

		else
			{
			System.out.println(" Enrolling " + student1.getName() + " in " + course1.getcourseCode() + " not successful ");
			}
			
		if (course2.enrollStudent())
			{
		System.out.println(" Enrolling " + student1.getName() + " in " + course2.getcourseCode() + " successful ");
		System.out.println(" Current enrollment " + course2.getCurrentEnrollment());
		System.out.println(" The current GPA is: " + grade2.getAverageScore());
			}

		else
			{
			System.out.println(" Enrolling " + student1.getName() + " in " + course2.getcourseCode() + " not successful ");
			}
		
		
		
		if (course1.enrollStudent())
			{
			System.out.println(" Enrolling " + student2.getName() + " in " + course1.getcourseCode() + " successful ");
			}

		else
			{
			System.out.println(" Enrolling " + student2.getName() + " in " + course1.getcourseCode() + " not successful ");	
			}
		
		if (course2.enrollStudent()) 
			{
			System.out.println(" Enrolling " + student2.getName() + " in " + course2.getcourseCode() + " successful ");	
			}
		else
			{
			System.out.println(" Enrolling " + student2.getName() + " in " + course2.getcourseCode() + " not successful ");	
			}
		//Add your code below for question 8
		if (grade1.getAverageScore() > grade2.getAverageScore()) {
			System.out.println(" Ashleys GPA in " + course1.getcourseCode() + " is greater than " + course2.getcourseCode());
		
		}
		else if (grade1.getAverageScore() < grade2.getAverageScore()) {
			System.out.println(" Ashleys GPA in " + course2.getcourseCode() + " is greater than " + course1.getcourseCode());
		}
	}
}


