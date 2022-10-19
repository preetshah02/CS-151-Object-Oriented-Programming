package business;
/**
 * 
 * This class inherits from the class Person and sets and gets the basic information of the customer 
 * and also provides with the payment preference that the customer chooses.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public class Customer extends Person
{
	//instance variables
	private int customerID;
	private String payPreference;
	
	//default constructor
	public Customer()
	{
		super();
	}
	
	//Parameterized constructor
	public Customer(String firstName, String lastName, Address address, int id, String ssn)
	{
		super(firstName, lastName, address, ssn);
		customerID = id;
	}
	
	/**
	 *  Gets the ID of the customer
	 *  
	 *  @return customerID
	 */
	public int getID()
	{
		return customerID;
	}
	
	/**
	 *  Sets the ID of the customer
	 *  
	 *  @param id ID of the customer
	 */
	public void setID(int id)
	{
		customerID = id;
	}
	
	/**
	 *  Gets the paying Preference of the customer
	 *  
	 *  @return payPreference  
	 */
	public String getPayPreference()
	{
		return payPreference;
	}
	
	/**
	 *  Sets the paying preference of the customer
	 *  
	 *  @param paymentMethod
	 */
	public void setPayPreference(String paymentMethod)
	{
		payPreference = paymentMethod;
	}
	
	/**
	 * Prints all the information of the customer in a single string
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\n Customer ID: " + customerID + "\n Payment Preference: " + payPreference;
	}
	
	/**
	 * Uses the toString() method to print out the information and introduces the customer.
	 * 
	 * 
	 * @param displaySSN a boolean variable which decides if the information will contain social security number or not.
	 */
	public void introduce(boolean displaySSN) {
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
	 * prints out the payment preference choosen by the customer
	 */
	public void makePayment()
	{
		System.out.println("Payment Method: " + payPreference);
	}
}
