package exercise1;
/**
 * Implement a generic method called count() to count the number of elements in a list of generic 
 * elements. Inside the main() method create an ArrayList of 5 String objects,
 * 6 Integer objects, and  8 Double objects. Make three different calls to the count() method, 
 * once for each of the three  lists, and print the result to command line.
 * 
 * 
 * @author Preet LNU
 * @version 4-25-2022
 */
import java.util.ArrayList;
import java.util.Arrays;

public class MethodTest 
{
	/**
	 * A generic method that counts the number of elements in the list.
	 *
	 * @param list 
	 * @return list.sizee() the size of the list
	 */
	public static<T> int count(ArrayList<T> list)
	{
		return list.size();
	}
	
	//Main method
	public static void main(String args[])
	{
		ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Hi,", "My", "name", "is", "Preet"));
		ArrayList<Integer> ints = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8));
	
		System.out.println("Number of elements in the list: " + count(strings));
		System.out.println("Number of elements in the list: " + count(ints));
		System.out.println("Number of elements in the list: " + count(doubles));
	}
}
