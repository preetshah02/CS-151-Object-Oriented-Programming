package business;
/**
 * 
 * This class inherits from the class Employee gets the basic information of the executive employee as well as gets the 
 * yearly bonus and compensation of the executive employee. This class also calculates the pay of the executive employee.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public class Executive extends Employee
{
	//instance variables
	private double yearlyBonus;
	private double yearlyCompensation;

	//default constructor
	public Executive()
	{
		super();
	}
	
	//Parameterized constructor
	public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		yearlyBonus = bonus;
		yearlyCompensation = pay;
	}
	
	/**
	 * Gets the yearly bonus of the executive employee
	 * 
	 * @return yearlyBonus
	 */
	public double getBonus()
	{
		return yearlyBonus;
	}
	
	/**
	 * Set the bonus of the executive employee
	 * 
	 * @param bonus
	 */
	public void setBonus(double bonus)
	{
		yearlyBonus = bonus;
	}
	
	/**
	 * Gets the yearly compensation of the executive employee
	 * 
	 * @return yearlyCompensation
	 */
	public double getCompensation()
	{
		return yearlyCompensation;
	}
	
	/**
	 * Sets the yearly compensation of the executive employee
	 * 
	 * @param pay
	 */
	public void setCompensation(double pay)
	{
		yearlyCompensation = pay;
	}
	
	/** 
	 * Prints all the information of an executive employee in a single string
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\n Executive: " +  "\n Yearly Bonus: " + yearlyBonus + "\n Yearly Compensation: " + yearlyCompensation + "\n Total Pay: " + computePay();
	}
	
	/**
	 * Uses the toString() method to print out the information and introduces the executive employee.
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
	
	public double computePay()
	{
		return yearlyCompensation + yearlyBonus;
	}
}
