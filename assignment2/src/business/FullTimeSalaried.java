package business;
/**
 * 
 * This class inherits from the abstract class FullTimeEmployee and computes the pay of a salaried employee 
 * based on the number of weeks they worked.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public class FullTimeSalaried extends FullTimeEmployee
{
	//default constructor
	public FullTimeSalaried()
	{
		super();
	}
	
	//Parameterized constructor
	public FullTimeSalaried(String firstName, String lastName, Address address, int id, double salary, String ssn)
	{
		super(firstName, lastName, address, id, salary, ssn);
	}
	
	/**
	 * Prints out all the information of a full time salaried employee
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	/**
	 * Uses the toString() method to print out the information and introduces the full time salaried employee.
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
	 * Computes the total pay of a full time salaried employee based on the number of weeks they worked
	 * 
	 * @param numWeeks
	 * @return getBasePay() * 1 / 52 * numWeeks
	 */
	public double computePay(int numWeeks)
	{
		return getBasePay() * 1 / 52 * numWeeks;
	}
}
