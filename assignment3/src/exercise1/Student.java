package exercise1;
/**
 * 
 * This class gets and sets the details about the Student 
 * 
 * @author Preet LNU
 * @version 2022-03-14
 * 
 */
public class Student implements Cloneable
{
	//instance variables
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	private Course course;
	
	public Student()
	{
		
	}
	
	public Student(String firstName, String lastName, int age, float gpa, String major, String department, Course course)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;
	}
	
	/**
	* This method sets the first name of the student
	* 
	* @param fname to enter and set the first name of the student
	*/
	public void setFirstName(String fname)
	{
		firstName = fname;
	}
	
	/**
	* This method sets the last name of the student
	* 
	* @param lname to enter and set the last name of the student
	*/

	public void setLastName(String lname)
	{
		lastName = lname;
	}
	
	/**
	* This method sets the age of the student
	* 
	* @param ag to enter and set the age of the student
	*/
	public void setAge(int ag)
	{
		age = ag;
	}
	
	/**
	* This method sets the gpa of the student
	* 
	* @param GPA to enter and set the gpa of the student
	*/
	public void setGpa(float GPA)
	{
		gpa = GPA;
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
	 * Sets the course that the student will be taking
	 * 
	 * @param c to enter and set the course that student will take.
	 */
	public void setCourse(Course c)
	{
		course = c;
	}
	
	/**
	* This method gets the first name of the student
	*
	*@return firstName first name of the student
	*/
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	* This method gets the last name of the student
	*
	*@return lastName last name of the student
	*/
	public String getLastName()
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
	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * Prints the information about the student as well as about the course
	 * 
	 */
	public void printInfo()
	{
		System.out.println("Student details: ");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println("GPA: " + gpa);
		System.out.println("Major: " + major);
		System.out.println("Department: " + department);
		
		System.out.println();
		
		System.out.println("Course Details: ");
		System.out.println("Course Name: " + course.getCourseName());
	    System.out.println("Course Description: " + course.getCourseDescription());
	    System.out.println("Department: " + course.getDepartment());
	    System.out.println("Time: " + course.getCourseStartTime());
	    System.out.println("Week Day: " + course.getCourseDays());
	    
	    System.out.println();
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}
}
