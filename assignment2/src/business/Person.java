package business;
/**
 * 
 * This abstract class gets and sets all the basic information about a person which will be
 * used in this project.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public abstract class Person 
{
	//instance variables
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private Address address;

	//default constructor
	public Person()
	{
		
	}
	
	//Parameterized constructor
	public Person(String firstName, String lastName, Address address, String ssn)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.ssn = ssn;
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
	 *  Gets the Social security number of the person
	 */
	public String getSSN()
	{
		return ssn;
	}
	
	/**
	 *  Gets the address of the person
	 */
	public Address getAddress()
	{
		return address;
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
	 *  sets the Social security number of the person
	 *  
	 *  @param sn social security number of the person
	 */
	public void setSSN(String sn)
	{
		ssn = sn;
	}
	
	/**
	 *  sets the address of the person
	 *  
	 *  @param addr address of the person
	 */
	public void setAddress(Address addr)
	{
		address = addr;
	}
	
	/**
	 *  Returns and prints all the information of the person
	 *  
	 *  @return "Person: " + firstName + " " + lastName + "\n age: " + age + "\n Address: " + address;
	 */
	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lastName + "\n age: " + age + "\n Address: " + address;
	}
}
