//package exercise3;
/**
* This class is the parent class of the Employee which has all the basic information for an employee and has all the setters and getters.
*
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Person 
{
	//instance variables
	private String firstName;
	private String lastName;
	private int age;
	private int ssn;
	private String address;
	private String gender;
	private float weight;
	
	//constructor
	public Person(String firstName, String lastName, int age, int ssn, String address, String gender, float weight)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
	
	// all the setters
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setSSN(int number)
	{
		ssn = number;
	}
	
	public void setAddress(String addr)
	{
		address = addr;
	}
	
	public void setGender(String gend)
	{
		gender = gend;
	}
	
	public void setWeight(float wt)
	{
		weight = wt;
	}
	
	// all the getters
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getSSN()
	{
		return ssn;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + firstName + " " + lastName + ", Age: "  + age + ", Social Security Number "  + ssn + ", Address: "  + address + ", Gender: " + gender + ", Weight: "  + weight ;
	}
	
	/**
	* Prints the toString()
	*/
	public void introduce()
	{
		System.out.println(toString()); 
	}

}
