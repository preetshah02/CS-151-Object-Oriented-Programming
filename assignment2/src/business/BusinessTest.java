package business;
/**
 * 
 * This class is a tester class for the program.
 * 
 * @author Preet LNU
 * @version 2022-03-02
 * 
 */
public class BusinessTest 
{
	//main method
	public static void main(String[] args)
	{
		//Test Case 1 of contractor
		Address address9 = new Address(123, "Some Street8", "City8", "1234", "States8");
        Contractor c = new Contractor("Donald", "Trump", address9, 9, 16.0, "15007");
        c.introduce(false);
        System.out.println(" Total Pay: " + c.computePay(30));
        System.out.println();
        
        //Test Case 2 of contractor
        Address address10 = new Address(123, "Some Street9", "City9", "1234", "States9");
        Contractor c1 = new Contractor("Joe", "Biden", address10, 10, 19.0, "15008");
        c1.introduce(true);
        System.out.println(" Total Pay: " + c1.computePay(20));
        System.out.println();
        
        //Test Case 1 of customer
        Address address11 = new Address(123, "Some Street10", "City10", "1234", "States10");
        Customer customer = new Customer("Barack", "Obama", address11, 11, "15009");
        customer.setPayPreference("Debit");
        customer.introduce(false);
        System.out.println();
        
        //Test Case 2 of customer
        Address address12 = new Address(123, "Some Street11", "City11", "1234", "States11");
        Customer customer1 = new Customer("George", "Bush", address12, 12, "15010");
        customer1.setPayPreference("Credit");
        customer1.introduce(true);
        System.out.println();
        
        //Test Case 1 of executive
        Address address = new Address(123, "Some Street", "City1", "1234", "States1");
        Executive executive = new Executive("Preet", "Shah", address, 1, 400000.0, 2000.0, "12233");
        executive.introduce(false);
        executive.computePay();
        System.out.println();

        //Test Case 2 of executive
        Address address2 = new Address(123, "Some Street2", "City2", "1234", "States2");
        Executive executive2 = new Executive("John", "Smith", address2, 2, 200000.0, 5000.0, "12414");
        executive2.introduce(true);
        executive2.computePay();
        System.out.println();
        
        //Test Case 1 of FullTimeHourly
        Address address3 = new Address(123, "Some Street3", "City3", "1234", "States3");
        FullTimeHourly fth = new FullTimeHourly("William", "Wingston", address3, 3, 18.0, 20.0, "15001");
        fth.introduce(false);
        System.out.println(" Total Pay: " + fth.computePay(50));
        System.out.println();
        
      	//Test Case 2 of FullTimeHourly
        Address address4 = new Address(123, "Some Street4", "City4", "1234", "States4");
        FullTimeHourly fth2 = new FullTimeHourly("Nhi", "Nguyen", address4, 4, 20.0, 25.0, "15002");
        fth2.introduce(true);
        System.out.println(" Total Pay: " + fth2.computePay(30));
        System.out.println();
        
        //Test Case 1 of FullTimeSalaried
        Address address5 = new Address(123, "Some Street5", "City5", "1234", "States5");
        FullTimeSalaried fts = new FullTimeSalaried("Anurag", "Shah", address5, 5, 200000.0, "15003");
        fts.introduce(false);
        System.out.println(" Total Pay: " + fts.computePay(40));
        System.out.println();
        
        //Test Case 2 of FullTimeSalaried
        Address address6 = new Address(123, "Some Street6", "City6", "1234", "States6");
        FullTimeSalaried fts2 = new FullTimeSalaried("Charlie", "Dany", address6, 6, 500000.0, "15004");
        fts2.introduce(true);
        System.out.println(" Total Pay: " + fts2.computePay(30));
        System.out.println();
        
        //Test Case 1 of PartTimeHourly
        Address address7 = new Address(123, "Some Street7", "City7", "1234", "States7");
        PartTimeHourly pth = new PartTimeHourly("Jasmine", "Lee", address7, 7, 24.0, "15005");
        pth.introduce(false);
        System.out.println(" Total Pay: " + pth.computePay(28));
        System.out.println();
        
        //Test Case 2 of PartTimeHourly
        Address address8 = new Address(123, "Some Street8", "City8", "1234", "States8");
        PartTimeHourly pth2 = new PartTimeHourly("Krishna", "Agrawal", address8, 8, 16.0, "15006");
        pth2.introduce(true);
        System.out.println(" Total Pay: " + pth2.computePay(30));
        System.out.println();
    }
}
