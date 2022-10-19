//package exercise5;
/**
* This class extends animals and implements methods from interfaces Scratchers
* 
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Racoon extends Animal implements Scratchers
{
	public Racoon(String animalType,String animalName, int age, String gender, String environment, int animalSpeed)
	{
		super(animalType, animalName, age, gender,environment, animalSpeed);
	}
	
	void move()
	{
		System.out.println("move racoon");
	}
	
	void sound()
	{
		System.out.println("sound racoon");
	}
	
	void eat()
	{
		System.out.println("eat racoon");
	}
	
	void sleep()
	{
		System.out.println("sleep racoon");
	}
	
	@Override
	public void scratch()
	{
		System.out.println("scratch racoon");
	}
	
	public String toString()
	{
		return super.toString();
	}
}

