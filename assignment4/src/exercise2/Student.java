package exercise2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 
 * This class gets and sets the details about the Student 
 * 
 * @author Preet LNU
 * @version 2022-04-04
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
	private LinkedList<Course> course;
	
	public Student()
	{
		course = new LinkedList<Course>();
	}
	
	public Student(String firstName, String lastName, int age, float gpa, String major, String department)
	{
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
	public void setCourse(LinkedList<Course> c)
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
	 * This method gets the list of courses
	 * 
	 * @return course
	 */
	public LinkedList<Course> getCourse()
	{
		return course;
	}
	
	/**
	 * This method adds course to the list
	 * 
	 * @param c course that needs to be added
	 */
	public void addCourse(Course c)
	{
		if(!course.contains(c))
		{
			course.add(c);
		}
	}
	
	/**
	 * This method removes courses from the list
	 * 
	 * @param c course that needs to be removed
	 */
	public void removeCourse(Course c)
	{
		if(course.contains(c))
		{
			course.remove(c);
		}
	} 
	
	/**
	 * THis method sorts courses with respect to the attribute
	 * 
	 * @param ascending checks whether the sorting needs to be done in ascending or descending order.
	 * @param attribute checks which attribute will be used to sort the list
	 */
	public void sortCourses(Boolean ascending, String attribute)
	{
		HashMap<String, Integer> daysMapping = new HashMap<String, Integer>();
		daysMapping.put("Sunday", 0);
		daysMapping.put("Monday", 1);
		daysMapping.put("Tuesday", 2);
		daysMapping.put("Wednesday", 3);
		daysMapping.put("Thursday", 4);
		daysMapping.put("Friday", 5);
		daysMapping.put("Saturday", 6);
		
		Collections.sort(course, new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2)
			{
				switch(attribute)
				{
					case "name":
						return c1.getCourseName().compareTo(c2.getCourseName());
					case "department":
                        return c1.getDepartment().compareTo(c2.getDepartment());
					case "time":
                        return c1.getCourseStartTime().compareTo(c2.getCourseStartTime());
					case "day":
                        return (daysMapping.get(c1.getCourseDays()) - 
                                daysMapping.get(c2.getCourseDays()));
					default:
                        return c1.getCourseName().compareTo(c2.getCourseName());
				}
			}
		});
		
		if(ascending = false)
		{
			Collections.reverse(course);
		}
		
		for(Course c: course)
		{
			System.out.println(c);
		}
	}
}
