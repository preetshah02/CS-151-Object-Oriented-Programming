//package exercise5;
/**
* This class is a tester class for the program
* 
* 
* @author Preet LNU
* @version 02-23-2022
*/
public class AnimalTest 
{
	public static void main(String[] args)
	{
		//creating instances
		Dog dog = new Dog("domestic", "dog", 10, "female", "home", 25);
		Cat cat = new Cat("domestic", "cat", 12, "male", "home", 20);
		Racoon racoon = new Racoon("wild", "racoon", 15, "female", "forest", 30);
		Whale whale = new Whale("wild", "whale", 60, "male", "ocean", 80);
		
		//calling the functionalities for dog
		dog.bark();
		dog.move();
		dog.sound();
		dog.eat();
		dog.sleep();
		dog.walk();
		dog.greetHuman();
		System.out.println(dog.toString());
		
		//calling the functionalities for cat
		System.out.println();
		cat.scratch();
		cat.move();
		cat.sound();
		cat.eat();
		cat.sleep();
		cat.walk();
		cat.greetHuman();
		System.out.println(cat.toString());
		
		//calling the functionalities for racoon
		System.out.println();
		racoon.scratch();
		racoon.move();
		racoon.sound();
		racoon.eat();
		racoon.sleep();
		System.out.println(racoon.toString());
		
		//calling the functionalities for whale
		System.out.println();
		whale.swim();
		whale.move();
		whale.sound();
		whale.eat();
		whale.sleep();
		System.out.println(whale.toString());
	}
}
