package business;
/**
 * 
 * This class inherits from the abstract class FullTimeEmployee, gets and sets the overtime pay of a full time hourly employee 
 * and also calculates the total pay of the employee.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public class FullTimeHourly extends FullTimeEmployee
{
	//instance variables
	private double overtimePay;

	//default constructor
	public FullTimeHourly()
	{
		super();
	}
	
	//Parameterized constructor
	public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtime, String ssn)
	{
		super(firstName, lastName, address, id, basePay, ssn);
		overtimePay = overtime;
	}
	
	/**
	 * Gets the amount of money payed for an hour of overtime
	 * 
	 * @return overtimePay
	 */
	public double getOvertimePay()
	{
		return overtimePay;
	}
	
	/**
	 * Sets the amount of money payed for an hour of overtime
	 * 
	 * @param ot
	 */
	public void setOvertimePay(double ot)
	{
		overtimePay = ot;
	}
	
	/**
	 * Prints out all the information of a full time hourly employee
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\n FullTimeHourly: " + "\n Overtime Pay: " + overtimePay;
	}
	
	/**
	 * Uses the toString() method to print out the information and introduces the full time hourly employee.
	 * 
	 * 
	 * @param displaySSN a boolean variable which decides if the information will contain social security number or not.
	 */
	public void introduce(boolean displaySSN) 
	{
        if (displaySSN) 
        {
            System.out.println(toString() + "\n SSN: " + getSSN());
        } 
        else 
        {
            System.out.println(toString());
        }
    }
	
	/**
	 * Computes the total pay of a full time hourly employee including the overtime work
	 * 
	 * @param numHrs
	 */
	public double computePay(int numHrs)
	{
		int overtimeHrs;
		if(numHrs > 40)
		{
			overtimeHrs = numHrs - 40;
			return (getBasePay() * 40) + (overtimeHrs * overtimePay);
		}
		return getBasePay() * numHrs;
	}
}
