package exercise2;
/**
 * 
 * This class acts as a tester for the program
 * 
 * @author Preet LNU
 * @version 2022-03-14
 * 
 */
public class EmployeeTest 
{
	//main method
	public static void main(String[] args)
	{
		//employee instance
		Employee employee = new Employee("John", "Smith", 101, 35f);
		
		//Printing employee's information
		employee.printInfo();
		
		employee.computePay(40);
		employee.computePay(23);
		employee.computePay(1);
		employee.computePay(0);
		employee.computePay(-5);
		employee.computePay(45);
	}
}
