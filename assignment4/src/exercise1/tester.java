package exercise1;

import java.util.ArrayList;
/**
 * This class is a tester class for the program
 * 
 * @author Preet LNU
 * @version 2022-04-04
 *
 */
public class tester
{
	public static void main(String[] args)
	{
		ListManipulator obj = new ListManipulator();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//adding number in the list
		numbers.add(10);
		numbers.add(15);
		numbers.add(5);
		numbers.add(10);
		numbers.add(100);
		numbers.add(100);
		numbers.add(3);
		
		System.out.println(obj.sort(numbers, true)); //printing in ascending order.
		System.out.println(obj.sort(numbers, false)); //prinitng in descending order
		
		System.out.println(obj.swapLargestSmallest(numbers));
	}
}
