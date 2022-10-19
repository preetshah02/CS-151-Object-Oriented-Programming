//package exercise5;
/**
* This class extends animals and implements methods from interface swimmers
* 
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Whale extends Animal implements Swimmers
{
	public Whale(String animalType,String animalName, int age, String gender, String environment, int animalSpeed)
	{
		super(animalType, animalName, age, gender,environment, animalSpeed);
	}
	
	void move()
	{
		System.out.println("move whale");
	}
	
	void sound()
	{
		System.out.println("sound whale");
	}
	
	void eat()
	{
		System.out.println("eat whale");
	}
	
	void sleep()
	{
		System.out.println("sleep whale");
	}
	
	@Override
	public void swim()
	{
		System.out.println("swim whale");
	}
	
	public String toString()
	{
		return super.toString();
	}
}
