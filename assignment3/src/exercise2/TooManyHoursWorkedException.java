package exercise2;
/**
 * 
 * This class forms a custom checked exception for the program
 * 
 * @author Preet LNU
 * @version 2022-03-14
 * 
 */
class TooManyHoursWorkedException extends Exception
{
	TooManyHoursWorkedException(String s)
	{
		super(s);
	}
}
