//package assignment1;
/**
* This class contains all the information fields of the students like name, age, gpa, major, department.
* 
* 
* 
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Student 
{
	//declaring instance variables
	private String firstName;
	private String lastName;
	private int age; 
	private float gpa;
	private String major;
	private String department;
	
	//constructor
	public Student(String firstName, String lastName, int age, float gpa, String major, String department)
	{
		//initializing instance variable
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
	}
	
	/**
	* This method sets the first name of the student
	* 
	* @param name to enter and set the first name of the student
	*/
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	/**
	* This method sets the last name of the student
	* 
	* @param name to enter and set the last name of the student
	*/
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	/**
	* This method sets the age of the student
	* 
	* @param a to enter and set the age of the student
	*/
	public void setAge(int a)
	{
		age = a;
	}
	
	/**
	* This method sets the gpa of the student
	* 
	* @param pointAverage to enter and set the gpa of the student
	*/
	public void setGpa (float pointAverage)
	{
		gpa = pointAverage;
	}
	
	/**
	* This method sets the major of the student
	* 
	* @param maj to enter and set the major of the student
	*/
	public void setMajor(String maj)
	{
		major = maj;
	}
	
	/**
	* This method sets the department of the student
	* 
	* @param dept to enter and set the department of the student
	*/
	public void setDepartment(String dept)
	{
		department = dept;
	}
	
	/**
	* This method gets the first name of the student
	*
	*@return firstName first name of the student
	*/
	public String getFirst()
	{
		return firstName;
	}
	
	/**
	* This method gets the last name of the student
	*
	*@return lastName last name of the student
	*/
	public String getLast()
	{
		return lastName;
	}
	
	/**
	* This method gets the age of the student
	*
	*@return age age of the student
	*/
	public int getAge()
	{
		return age;
	}
	
	/**
	* This method gets the gpa of the student
	*
	*@return gpa Grade point average of the student
	*/
	public float getGpa()
	{
		return gpa;
	}
	
	/**
	* This method gets the major of the student
	*
	*@return major major name of the student
	*/
	public String getMajor()
	{
		return major;
	}
	
	/**
	* This method gets the department of the student
	*
	*@return department department of the student
	*/
	public String getDept()
	{
		return department;
	}
	
	//inner class Course
	public class Course
	{
		/**
		* Prints the schedule of the student
		*
		*/
		public void printSchedule()
		{
			System.out.println("CS151 Tue/Thur 6-7:15");
			System.out.println("Eng101 Mon/Wed 10-11:15");
			System.out.println("Hist100 Tue/Thur 1:30-2:45");
		}
	}
	
	/**
	* Prints all the information provided and also prints the students schedule.
	*/
	public void print()
	{
		//printing the information of the student
		System.out.println(firstName + " " + lastName + ", " + age + " years old, " + gpa + " gpa, " + major + " major, " + department + " department. " );
		
		System.out.println();
		System.out.println("Student's Schedule");
		System.out.println();
		
		//creating an object and using printSchedule() method to print out the schedule for the student
		Course c = new Course();
		c.printSchedule();
	}

}
