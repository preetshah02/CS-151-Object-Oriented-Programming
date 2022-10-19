
/**
 * 
 * This class gets and sets the address and then prints it out
 * 
 * @author Preet LNU
 * @version 2022-05-15
 * 
 */
public class Address 
{
	//instance variables
	private int streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	
	/**
	 * Constructor of the class Address
	 * 
	 * 
	 * @param streetNum 	entered street number
	 * @param streetName 	entered street name
	 * @param city       	entered city 
	 * @param zip			entered zip code
	 * @param state			entered state
	 */
	public Address(int streetNum, String streetName, String city, String state, String zip)
	{
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	
	/**
	 *  Gets the Street Number in the address
	 *  
	 *  @return streetNum
	 */
	public int getStreetNum()
	{
		return streetNum;
	}
	
	/**
	 *  Gets the Street Name in the address
	 *  
	 *  @return streetName
	 */
	public String getStreetName()
	{
		return streetName;
	}
	
	/**
	 *  Gets the city in the address
	 *  
	 *  @return city
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 *  Gets the zip code in the address
	 *  
	 *  @return zip
	 */
	public String getZip()
	{
		return zip;
	}
	
	/**
	 *  Gets the state in the address
	 *  
	 *  @return state
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 *  Sets the Street Number in the address
	 *  
	 *  @param num street number of the address
	 */
	public void setStreetNum(int num)
	{
		streetNum = num;
	}
	
	/**
	 *  Sets the Street name in the address
	 *  
	 *  @param name street name of the address
	 */
	public void setStreetName(String name)
	{
		streetName = name;
	}
	
	/**
	 *  Sets the zip code in the address
	 *  
	 *  @param z zip code of the address
	 */
	public void setZip(String z)
	{
		zip = z;
	}
	
	/**
	 *  Sets the city in the address
	 *  
	 *  @param cty city of the address
	 */
	public void setCity(String cty)
	{
		city = cty;
	}
	
	/**
	 *  Sets the State in the address
	 *  
	 *  @param st state of the address
	 */
	public void setState(String st)
	{
		state = st;
	}
	
	/**
	 * Prints the address
	 * 
	 * @return streetNum + ", " + streetName + ", " + city + ", " + state + "- " + zip;
	 */
	@Override
	public String toString()
	{
		return  streetNum + ", " + streetName + ", " + city + ", " + state + "- " + zip; 
	}
}
