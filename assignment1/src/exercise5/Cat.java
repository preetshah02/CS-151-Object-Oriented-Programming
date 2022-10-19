//package exercise5;
/**
* This class extends animals and implements methods from interfaces Domesticated and Scraters
* 
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Cat extends Animal implements Domesticated, Scratchers
{
	public Cat(String animalType,String animalName, int age, String gender, String environment, int animalSpeed)
	{
		super(animalType, animalName, age, gender,environment, animalSpeed);
	}
	
	//functionalities available for cats
	void move()
	{
		System.out.println("move cat");
	}
	
	void sound()
	{
		System.out.println("sound cat");
	}
	
	void eat()
	{
		System.out.println("eat cat");
	}
	
	void sleep()
	{
		System.out.println("sleep cat");
	}
	
	@Override
	public void walk()
	{
		System.out.println("walk cat");
	}

	@Override
	public void greetHuman()
	{
		System.out.println("greet human cat");
	}
	
	@Override
	public void scratch()
	{
		System.out.println("scratch cat");
	}
	
	public String toString()
	{
		return super.toString();
	}
}

