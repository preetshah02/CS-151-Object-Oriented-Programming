//package exercise3;
/**
* This class gets the attributes and methods from the parent class called Person. 
* This class also calculates the payment that the employee gets.
*
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Employee extends Person 
{
	//declaring instance variables
	private int id;
	private String status;
	private double payAmount;
	
	//constructor
	public Employee(String firstName, String lastName, int age, int ssn, String address, String gender, float weight, int id, String status, double payAmount)
	{
		super(firstName, lastName, age, ssn, address, gender, weight); //invoking parent class constructor
		this.id = id;
		this.status = status;
		this.payAmount = payAmount;
	}
	
	/**
	* This method sets the ID of the Employee
	*
	*@param ID id of the employee
	*/
	public void setID(int ID)
	{
		id = ID;
	}
	
	/**
	* This method sets the status of the Employee
	*
	*@param stat status of the employee
	*/
	public void setStatus(String stat)
	{
		status = stat;
	}
	
	/**
	* This method sets the pay amount of the Employee
	*
	*@param pay pay amount of the employee
	*/
	public void setPayAmount(double pay)
	{
		payAmount= pay;
	}
	
	/**
	* This method gets the ID of the Employee
	*
	*@return id ID of the employee
	*/
	public int getID()
	{
		return id;
	}
	
	/**
	* This method gets the status of the Employee
	*
	*@return status Status of the employee
	*/
	public String getStatus()
	{
		return status;
	}
	
	/**
	* This method gets the pay amount of the Employee
	*
	*@return payAmount Pay amount of the employee
	*/
	public double getPayAmount()
	{
		return payAmount;
	}
	
	/**
	* Introduces the employee by providing their information.
	*
	*/
	@Override
	public void introduce()
	{
		System.out.println(toString());
	}
	
	/**
	* This method calculates the payment that the employee earned based on the time they worked.
	*
	*@param timeWorked amount of time the employee worked
	*/
	public double calculatePay(double timeWorked)
	{
		if(status.equalsIgnoreCase("Full time"))
		{
			return payAmount * 1/52 * timeWorked;
		}
		else 
		{
			return payAmount * timeWorked;
		}
		
	}
	
	/**
	* Prints all the information provided.
	*
	*@return super.toString() + ", Employee ID: " + id + ", Status: " + status + " Pay: $" + payAmount; Information of the employee
	*/
	@Override
	public String toString()
	{
		return super.toString() + ", Employee ID: " + id + ", Status: " + status + " Pay: $" + payAmount;
	}
}
