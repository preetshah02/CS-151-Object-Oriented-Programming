package exercise1;
/**
 * 
 * This class acts as a tester for the program
 * 
 * @author Preet LNU
 * @version 2022-03-14
 * 
 */
public class StudentTest 
{
	//main method
	public static void main(String[] args)
	{
		//instance of Course
		Course course1 = new Course("CS 151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue" );
		
		//instance of a student
		Student student1 = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science", course1);
		
		Student student2 = null;
		
		//Deep copying
		try
		{
			student2 = (Student) student1.clone();
		}
		catch(CloneNotSupportedException s)
		{
			s.printStackTrace();
		}
		
		//Printing the information
		student1.printInfo();
		student2.printInfo();
	}
}
