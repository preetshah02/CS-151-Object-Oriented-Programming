//package exercise5;
/**
* This class extends animals and implements methods from interfaces Domesticated 
* 
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class Dog extends Animal implements Domesticated
{
	public Dog(String animalType,String animalName, int age, String gender, String environment, int animalSpeed)
	{
		super(animalType, animalName, age, gender,environment, animalSpeed);
	}
	
	void move()
	{
		System.out.println("move dog");
	}
	
	void sound()
	{
		System.out.println("sound dog");
	}
	
	void eat()
	{
		System.out.println("eat dog");
	}
	
	void sleep()
	{
		System.out.println("sleep dog");
	}
	
	void bark()
	{
		System.out.println("bark");
	}
	
	@Override
	public void walk()
	{
		System.out.println("walk dog");
	}

	@Override
	public void greetHuman()
	{
		System.out.println("greet human dog");
	}
	
	public String toString()
	{
		return super.toString();
	}
}
