package business;
/**
 * 
 * This class inherits from the abstract class Employee, sets and gets the hourly pay of a part time employee. 
 * This class also calculates the total pay of the part time employee.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public class PartTimeHourly extends Employee
{
	//instance variables
	private double baseHourlyPay;
	
	//default constructor
	public PartTimeHourly()
	{
		super();
	}
	
	//Parameterized constructor
	public PartTimeHourly(String firstName, String lastName, Address address, int id, double pay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		baseHourlyPay = pay;
	}
	
	/**
	 * Gets the base hourly pay of a part time employee
	 * 
	 * @return baseHourlyPay
	 */
	public double getHourlyPay()
	{
		return baseHourlyPay;
	}
	
	/**
	 * Sets the hourly pay of a part time employee
	 * 
	 * @param pay
	 */
	public void setHourlyPay(double pay)
	{
		baseHourlyPay = pay;
	}
	
	/**
	 * Prints out all the information of a part time employee in a single string
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\n PartTimeHourly: " + "\n Base Hourly Pay: " + baseHourlyPay;
	}
	
	/**
	 * Uses the toString() method to print out the information and introduces the part time employee.
	 * 
	 * 
	 * @param displaySSN a boolean variable which decides if the information will contain social security number or not.
	 */
	public void introduce(boolean displaySSN) 
	{
        if (displaySSN) 
        {
            System.out.println(toString() + "\nSSN: " + getSSN());
        } 
        else 
        {
            System.out.println(toString());
        }
    }
	
	/**
	 * Computes the total pay of a part time employee based on the number of hours they worked
	 * 
	 * @param numHrs
	 * @return baseHourlyPay * numHrs if numHrs is less than 40
	 */
	public double computePay(int numHrs)
	{
		if(numHrs > 40)
		{
			return -1;
		}
		else
		{
			return baseHourlyPay * numHrs;
		}
	} 
}
