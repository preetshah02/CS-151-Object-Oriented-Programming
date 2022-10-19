package exercise3;

/**
 * 
 * This abstract class gets and sets all the basic information about a person which will be
 * used in this project.
 * 
 * @author Preet LNU
 * @version 2022-04-04
 * 
 */
public class Person 
{
	//instance variables
	private String firstName;
	private String lastName;
	private int age;
	//default constructor
	public Person()
	{
		
	}
	
	//Parameterized constructor
	public Person(String firstName, String lastName,int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 *  Gets the first name of the person
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 *  Gets the last name of the person
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 *  Gets the age of the person
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 *  sets the first name of the person
	 *  
	 *  @param fname first name of the person
	 */
	public void setFirstName(String fname)
	{
		firstName = fname;
	}
	
	/**
	 *  sets the last name of the person
	 *  
	 *  @param lname last name of the person
	 */
	public void setLastName(String lname)
	{
		lastName = lname;
	}
	
	/**
	 *  sets the age of the person
	 *  
	 *  @param a age of the person
	 */
	public void setAge(int a)
	{
		age = a;
	}
	
	/**
	 *  Returns and prints all the information of the person
	 *  
	 *  @return "Person: " + firstName + " " + lastName + "\n age: " + age + "\n Address: " + address;
	 */
	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lastName + "\n age: " + age;
	}
}
