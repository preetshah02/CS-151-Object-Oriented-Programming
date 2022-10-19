package business;
/**
 * 
 * This abstract class inherits from the class Person and gets and sets the basic information about the employee
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public abstract class Employee extends Person
{
	//instance variables
	private int id;
	private String educationLevel;
	private boolean directDeposit;

	//default constructor
	public Employee()
	{
		super();
	}
	
	//Parameterized constructor
	public Employee(String firstName, String lastName, Address address, int id, String ssn)
	{
		super(firstName, lastName, address, ssn);
		this.id = id;
		
	}
	
	/**
	 * Gets the ID of the employee
	 * 
	 * @return id
	 */
	public int getID()
	{
		return id;
	}
	
	/**
	 * Gets the education level of the employee
	 * 
	 * @return educationLevel
	 */
	public String getEducation()
	{
		return educationLevel;
	}
	
	/**
	 * Gets the Direct Deposit of the employee
	 * 
	 * @return directDeposit
	 */
	public boolean getDirectDeposit()
	{
		return directDeposit;
	}
	
	/** 
	 * Sets the ID of the employee
	 * 
	 * @param ID id of the employee
	 */
	public void setID(int ID)
	{
		id = ID;
	}
	
	/**
	 * Sets the education level of the employee
	 * 
	 * @param education education level of the employee
	 */
	public void setEducation(String education)
	{
		educationLevel = education;
	}
	
	/**
	 * Sets the direct deposit of the employee
	 * 
	 * @param deposit
	 */
	public void setDirectDeposit(boolean deposit)
	{
		directDeposit = deposit;
	}
	
	/**
	 * Prints out all the information of the employee in a single string
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\n Employee ID: " + id + "\n Education: " + educationLevel + "\n Direct Deposit: " + directDeposit;
	}
}
