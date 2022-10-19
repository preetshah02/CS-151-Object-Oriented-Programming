package business;
/**
 * 
 * This abstract class inherits from the class Employee, gets and sets the basic information about full time employees
 *  and gets and sets the base pay of a full time employee.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public abstract class FullTimeEmployee extends Employee
{
	//instance variables
	private double basePay;
	
	//default constructor
	public FullTimeEmployee()
	{
		super();
	}
	
	//Parameterized constructor
	public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		this.basePay = basePay;
	}
	
	/**
	 * Gets the base pay of a full time employee
	 * 
	 * @return basePay
	 */
	public double getBasePay()
	{
		return basePay;
	}
	
	/**
	 * Sets the base pay of a full time employee
	 * 
	 * @param pay
	 */
	public void setBasePay(double pay)
	{
		basePay = pay;
	}
	
	/**
	 * Prints out all the information of a full time employee in a single string
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\n FullTimeEmployee:" + "\n Base Pay: " + basePay;
	}
}
