package exercise3;

import java.util.ArrayList;
/**
 * This class is a tester class
 * 
 * @author Preet LNU
 * @version 2022-04-04
 *
 */
public class PersonTest
{
	public static void main(String[] args) 
	{
		ArrayList<Object> allPersons = new ArrayList<Object>();
                 
		Person person1 = new Person("Joe", "Smith", 40);
		allPersons.add(person1);
                 
		Person person2 = new Person("Amy", "Gold", 32);
        allPersons.add(person2);
                 
        Person person3 = new Person("Tony", "Stork", 21);
        allPersons.add(person3);
                 
        Person person4 = new Person("Sean", "Irish", 24);
        allPersons.add(person4);
                 
        Person person5 = new Person("Tina", "Brock", 28);
        allPersons.add(person5);
                 
        Person person6 = new Person("Lenny", "Hep", 18);
        allPersons.add(person6);
                 
        System.out.println("Sorted by age(ascending): ");       
        allPersons.sort((o1, o2) -> (Integer.compare(((Person) o1).getAge(), ((Person) o2).getAge())));  
        for (int i = 0; i < allPersons.size(); i++)
        {
        	System.out.print(((Person) allPersons.get(i)).getFirstName());
        	System.out.print(" "+((Person) allPersons.get(i)).getLastName() +", ");
        	System.out.print(((Person) allPersons.get(i)).getAge()+"\n");       
        }
        System.out.println();
        
        System.out.println("Sorted by age(descending): ");
        allPersons.sort((o2, o1) -> (Integer.compare(((Person) o1).getAge(), ((Person) o2).getAge())));
        for (int i = 0; i < allPersons.size(); i++)
        {
        	System.out.print(((Person) allPersons.get(i)).getFirstName());
        	System.out.print(" "+((Person) allPersons.get(i)).getLastName() +", ");
        	System.out.print(((Person) allPersons.get(i)).getAge()+"\n");
                        
        }
        System.out.println();
        
        System.out.println("Sorted by First Name(ascending): ");   
        allPersons.sort((o1, o2) -> ((Person) o1).getFirstName().compareTo(((Person) o2).getFirstName())); 
        for (int i = 0; i < allPersons.size(); i++)
        {
        	System.out.print(((Person) allPersons.get(i)).getFirstName());
        	System.out.print(" "+((Person) allPersons.get(i)).getLastName() +", ");
        	System.out.print(((Person) allPersons.get(i)).getAge()+"\n");
                        
        }
        System.out.println();
        
        System.out.println("Sorted by First Name(descending): "); 
        allPersons.sort((o2, o1) -> ((Person) o1).getFirstName().compareTo(((Person) o2).getFirstName()));
        for (int i = 0; i < allPersons.size(); i++)
        {
        	System.out.print(((Person) allPersons.get(i)).getFirstName());
        	System.out.print(" "+((Person) allPersons.get(i)).getLastName() +", ");
        	System.out.print(((Person) allPersons.get(i)).getAge()+"\n");
                        
        }
        System.out.println();
                 
        System.out.println("Sorted by Last Name(ascending): ");   
        allPersons.sort((o1, o2) -> (Integer.compare(((Person) o1).getLastName().length(), ((Person) o2).getLastName().length())));  
        for (int i = 0; i < allPersons.size(); i++)
        {
        	System.out.print(((Person) allPersons.get(i)).getFirstName());
        	System.out.print(" "+((Person) allPersons.get(i)).getLastName() +", ");
        	System.out.print(((Person) allPersons.get(i)).getAge()+"\n");
                        
        }
        System.out.println();
        
        System.out.println("Sorted by Last Name(descending): ");  
        allPersons.sort((o2, o1) -> (Integer.compare(((Person) o1).getLastName().length(), ((Person) o2).getLastName().length())));          
        for (int i = 0; i < allPersons.size(); i++)
        {
        	System.out.print(((Person) allPersons.get(i)).getFirstName());
        	System.out.print(" "+((Person) allPersons.get(i)).getLastName() +", ");
        	System.out.print(((Person) allPersons.get(i)).getAge()+"\n");
                        
        }
	}
}