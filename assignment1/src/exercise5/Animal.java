//package exercise5;
/**
* This class is the parent class in this program which has all the setters and getters for the program.
* This class also has the information about the animals.
*
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Animal 
{
	//instance variables
	private String animalType;
	private String animalName;
	private int age;
	private String gender;
	private String environment;
	private int animalSpeed;
	
	//constructor
	public Animal(String animalType,String animalName, int age, String gender, String environment, int animalSpeed)
	{
		this.animalType = animalType;
		this.animalName = animalName;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.animalSpeed = animalSpeed;
	}
	
	//all the setters
	public void setAnimalType(String type)
	{
		animalType = type;
	}
	
	public void setAnimalName(String name)
	{
		animalName = name;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setGender(String gen)
	{
		gender = gen;
	}
	
	public void setEnvironment(String env)
	{
		environment = env;
	}
	
	public void setAnimalSpeed(int speed)
	{
		animalSpeed = speed;
	}
	
	//all the getters
	public String getAnimalType()
	{
		return animalType;
	}
	
	public String getAnimalName()
	{
		return animalName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getEnvironment()
	{
		return environment;
	}
	
	public int getAnimalSpeed()
	{
		return animalSpeed;
	}
	
}
