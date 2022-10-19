package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
/** 
 * Uses some of the basic functions of collections
 * 
 * @author Preet LNU
 * @version 2022-04-04
 *
 */
public class ListManipulator 
{	
	/**
	 * This method sorts the arrayList
	 * 
	 * @param myLst list that will be sorted
	 * @param ascending to determine the order in which the list will be sorted
	 * @return myLst sorted list
	 */
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending)
	{
		if(ascending)
		{
			Collections.sort(myLst);
		}
		else
		{
			Collections.sort(myLst, Collections.reverseOrder());
		}
		return myLst;
	}
	
	/**
	 * Swaps the largest number in the list with the smallest number
	 * 
	 * @param myLst list that will be used
	 * @return myLst modified list with the largest and smallest number swapped
	 */
	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
	{
		int largest = myLst.indexOf(Collections.max(myLst));
		int smallest = myLst.indexOf(Collections.min(myLst));
		Collections.swap(myLst, largest, smallest);
		return myLst;
	}
	
	/**
	 * Creates a table of unique values and the number of times each value occurs
	 * @param myLst list that will be used
	 */
	void table(ArrayList<Integer> myLst)
	{
		HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < myLst.size(); i++) 
        {
        	if(!frequency.containsKey(myLst.get(i)))
        	{
        		frequency.put(myLst.get(i), 1);
            } 
        	else 
        	{
        		frequency.put(myLst.get(i), frequency.get(myLst.get(i))+1);
        	}
        }
        Map<Object, Object> sortedMap = frequency.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        for(Object key : sortedMap.keySet()) 
        {
        	System.out.println(key +"\t:\t"+ sortedMap.get(key));
        }
	}
}
