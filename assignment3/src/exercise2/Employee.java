package exercise2;
/**
 * 
 * This class gets and sets the details about the employee and calculates their total pay 
 * 
 * @author Preet LNU
 * @version 2022-03-14
 * 
 */
public class Employee 
{
	//instance variables
	private String firstName;
	private String lastName;
	private int employeeID;
	private float hourlyPay;
	
	public Employee()
	{
		
	}
	
	/**
	 * Constructor of the class Employee
	 * 
	 * @param firstName
	 * @param lastName
	 * @param employeeID
	 * @param hourlyPay
	 */
	public Employee(String firstName, String lastName, int employeeID, float hourlyPay)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.hourlyPay = hourlyPay;
	}
	
	/**
	 * Sets the first name of the employee
	 * 
	 * @param fname to enter and set the first name of the employee
	 */
	public void setFirstName(String fname)
	{
		firstName = fname;
	}
	
	/**
	 * Sets the last name of the employee
	 * 
	 * @param lname to enter and set the last name of the employee
	 */
	public void setLastName(String lname)
	{
		lastName = lname;
	}
	
	/**
	 * Sets the ID of the employee
	 * 
	 * @param id to enter and set the ID of the employee
	 */
	public void setEmployeeID(int id)
	{
		employeeID = id;
	}
	
	/**
	 * Sets the hourly pay of the employee
	 * 
	 * @param pay to enter and the amount of pay an employee gets hourly
	 */
	public void setHourlyPay(float pay)
	{
		hourlyPay = pay;
	}
	
	/**
	 * Gets the first name of the employee
	 * 
	 * @return firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * gets the last name of the employee
	 * 
	 * @return lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Gets the ID of the employee
	 * 
	 * @return employeeID
	 */
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	/**
	 * gets the hourly pay of the employee
	 * 
	 * @return hourlyPay
	 */
	public float getHourlyPay()
	{
		return hourlyPay;
	}
	
	/**
	 * Calculates the total pay of the employee in the hours worked is less than 40, else throw a custom exception
	 * 
	 * @param hours number of hours worked
	 * @return totalPay Calculate total pay of the employee
	 */
	public float computePay(int hours)
	{
		float totalPay = 0;
		try 
		{
			if(hours > 40 || hours < 0)
			{
				System.out.println("Hours Worked: " + hours);
				throw new TooManyHoursWorkedException("Invalid number of hours");
			}
			else
			{
				totalPay = hours * getHourlyPay();
				System.out.println("Hours Worked: " + hours);
				System.out.println("Total Pay: $" + totalPay);
				System.out.println();
			}
		}
		catch(TooManyHoursWorkedException e)
		{
			System.out.println(e);
		}
		return totalPay;
	}
	
	/**
	 * Prints the information about the employee
	 */
	public void printInfo()
	{
		System.out.println("Employee details: ");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("ID: " + employeeID);
		System.out.println("Hourly Pay: $ " + hourlyPay + "/hr");
		
		System.out.println();
	}
}
