//package exercise3;
/**
* This class tests the program by creating Employee objects
* 
* 
* @author Preet LNU
* @version 02-23-2022
*
*/
public class EmployeeTest 
{
	//main method
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Joe", "Smith", 30, 123123, "123 SJSU", "Male", 180f, 12456754, "a contractor", 60);
		emp1.introduce();
		System.out.println("Employee Earned: $" + emp1.calculatePay(30));
		
		System.out.println();
		Employee emp2 = new Employee("Lisa", "Gray", 56, 125125, "125 SJSU", "Female", 120f, 112345, "Full time", 110000);
		emp2.introduce();
		System.out.println("Employee Earned: $" + emp2.calculatePay(2));
		
		System.out.println();
		Employee emp3 = new Employee("Timothy", "Briggs", 23, 128128, "128 SJSU", "Male", 165f, 1123245, "Full time", 80000);
		emp3.introduce();
		System.out.print("Employee Earned: $" + emp3.calculatePay(4));
		System.out.println();
		
		System.out.println();
		Employee emp4 = new Employee("George", "Wallace", 60, 1234567, "150 SJSU", "Male", 150f, 1121414, "part time", 20);
		emp4.introduce();
		System.out.print("Employee Earned: $" + emp4.calculatePay(25));
		System.out.println();
		
		System.out.println();
		Employee emp5 = new Employee("Amy", "Student", 30, 129129, "129 SJSU", "Female", 115f, 12455515, "Contractor employee", 45);
		emp5.introduce();
		System.out.print("Employee Earned: $" + emp5.calculatePay(45));
		System.out.println();
	}

}
