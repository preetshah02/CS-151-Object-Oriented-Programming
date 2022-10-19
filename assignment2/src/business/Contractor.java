package business;
/**
 * 
 * This class inherits from the Employee class and calculates the pay of a contractor while also printing their information
 * 
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public class Contractor extends Employee
{
	//instance variables
	private double basePay;
	
	//default constructor
	public Contractor()
	{
		super();
	}
	
	//Parameterized constructor
	public Contractor(String firstName, String lastName, Address address, int id, double pay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		basePay = pay;
	}
	
	/**
	 *  Gets the base pay of the contractor
	 *  
	 *  @return basePay
	 */
	public double getBasePay()
	{
		return basePay;
	}
	
	/**
	 *  Sets the base pay of the contractor
	 *  
	 *  @param pay entered pay amount
	 */
	public void setBasePay(double pay)
	{
		basePay = pay;
	}
	
	/**
	 *  Prints all the information of the contractor
	 *  
	 *  @return super.toString() + "\n Contractor: " + "\n Base Pay: " + basePay;
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\n Contractor: " + "\n Base Pay: " + basePay;
	}
	
	/**
	 *  This method introduces the contractor and prints out all the information
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
	 *  Computes the payment of the contractor based on the number of hours worked
	 *  
	 *  @param numHrs number of hours worked.
	 */
	public double computePay(int numHrs)
	{
		return basePay * numHrs;
	}

}
