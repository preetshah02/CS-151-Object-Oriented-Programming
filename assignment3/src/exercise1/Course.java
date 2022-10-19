package exercise1;
/**
 * 
 * This class gets and sets the details about the course 
 * 
 * @author Preet LNU
 * @version 2022-03-14
 * 
 */
public class Course implements Cloneable
{
	//instance variables
	private String courseName;
	private String courseDescription;
	private String department;
	private String courseStartTime;
	private String courseDays;
	
	public Course()
	{
		
	}
	
	/**
	 * Constructor for the class Course
	 * 
	 * @param courseName 	name of the course
	 * @param courseDescription 	description of the course
	 * @param department 	department that this course belongs to
	 * @param courseStartTime 	Time at which the course starts. 
	 * @param courseDays	Day at which the course class is held.
	 */
	public Course(String courseName, String courseDescription, String department, String courseStartTime, String courseDays)
	{
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.courseStartTime = courseStartTime;
		this.courseDays = courseDays;
	}
	
	/**
	 * Sets the course Name
	 * 
	 * @param name  name of the course
	 */
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	/**
	 * Sets the description of the course
	 * 
	 * @param description description of the course
	 */
	public void setCourseDescription(String description)
	{
		courseDescription = description;
	}
	
	/**
	 * Sets the department that the course belongs to
	 * 
	 * @param dept department of the course
	 */
	public void setDepartment(String dept)
	{
		department = dept;
	}
	
	/** 
	 * Sets the time at which the course starts.
	 * 
	 * @param time	Starting time of the course
	 */
	public void setCourseStartTime(String time)
	{
		courseStartTime = time;
	}
	
	/**
	 * Sets the day at which the course's class will be held
	 * 
	 * @param days day at which the course will be held
	 */
	public void setCourseDays(String days)
	{
		courseDays = days;
	}
	
	/**
	 * Gets the name of the course
	 * 
	 * @return courseName
	 */
	public String getCourseName()
	{
		return courseName;
	}
	
	/**
	 * Gets the description of the course
	 * 
	 * @return courseDescription
	 */
	public String getCourseDescription()
	{
		return courseDescription;
	}
	
	/**
	 * Gets the department of the course
	 * 
	 * @return department
	 */
	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * Gets the course's starting time
	 * 
	 * @return courseStartTime
	 */
	public String getCourseStartTime()
	{
		return courseStartTime;
	}
	
	/**
	 * Gets the days at which the course will be held
	 * 	
	 * @return courseDays
	 */
	public String getCourseDays()
	{
		return courseDays;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
