import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Using only Java reflection libraries to perform some tasks.
 * 
 * @author Preet LNU
 * @version 2022-05-15
 * 
 */
public class ReflectionTest 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		//getting declared methods of Person class
		Method[] declaredMethods = Person.class.getDeclaredMethods();
		System.out.println("Person Class Methods: \n");
                
		//loop to display all methods indo
		for (int i = 0; i < declaredMethods.length; i++) 
		{
			//display method name and parameters count    
			System.out.printf("%-12s : Parameters: %1d",declaredMethods[i].getName(),declaredMethods[i].getParameterCount());
			//get parameters types
			Class[] parameters = declaredMethods[i].getParameterTypes();
			if(parameters.length > 0)
			{
				System.out.printf(" : Parameter Types: ");
			}
			//loop to display parameter names
			for(Class parameter : parameters)
			{
				System.out.print(" "+parameter.getSimpleName());
			}
			System.out.print("\n");
		}
                
		//getting declared methods of Address class
		Method[] declaredMethodAddress =Address.class.getDeclaredMethods();
        System.out.println("\n\nAddress Class Methods : \n");
                
        //loop to display all methods indo
        for (int i = 0; i < declaredMethodAddress.length; i++) 
        {
            
        	//display method name and parameters count      
        	System.out.printf("%-14s : Parameters: %1d",declaredMethodAddress[i].getName(),declaredMethods[i].getParameterCount());
        	//get parameters types    
        	Class[] parameters = declaredMethodAddress[i].getParameterTypes();
         	if(parameters.length > 0)
         	{
         		System.out.printf(" : Parameter Types-");
         	}
         	//loop to display parameter names
         	for(Class parameter : parameters)
         	{
         		System.out.print(" "+parameter.getSimpleName());
         	}
                
         	System.out.print("\n");
            
        }
                
        //get all fields from Address array
        Field[] fields = Address.class.getDeclaredFields();
     	System.out.println("\n\nAddress Class Fields : \n");
       	//loop to display name, type and modifier of fields
       	for (Field field  :fields) 
       	{
       		System.out.printf("%-10s %-8s   %s\n",field.getName(),field.getAnnotatedType().getType().getTypeName(),Modifier.toString(field.getModifiers()));
       	}
              
       	try
       	{
       		Constructor<Person> personConstructor1 = Person.class.getConstructor(String.class, String.class, Address.class, String.class);
       		Constructor<Address> addressConstructor = Address.class.getConstructor(int.class, String.class, String.class, String.class, String.class);
       		
       		Address instance1 = addressConstructor.newInstance(1234, "Adam St.", "San Jose", "CA", "112345");
       		Person p1 = personConstructor1.newInstance("Johnny", "Deep", instance1, "1145");
       		p1.setAge(55);
       		System.out.println("\n" + p1.toString());

       		Address instance2 = addressConstructor.newInstance(2233, "Washington St.", "San Jose", "CA", "120394");
       		Person p2 = personConstructor1.newInstance("Elon", "Musk", instance2, "1144");
       		p2.setAge(45);
       		System.out.println("\n" + p2.toString());
       		
       		Address instance3 = addressConstructor.newInstance(2345, "Santa Clara St.", "San Jose", "CA", "112345");
       		Person p3 = personConstructor1.newInstance("Lizzie", "Olsen", instance3, "1143");
       		p3.setAge(35);
       		System.out.println("\n" + p3.toString());
       		
       		System.out.println("\n" + "Invoking Person 2");
       		
       		Method setFirstName = p2.getClass().getDeclaredMethod("setFirstName", String.class);
       		Method setLastName = p2.getClass().getDeclaredMethod("setLastName", String.class);
       		Method setAge = p2.getClass().getDeclaredMethod("setAge", int.class);
       		
       		System.out.println("\n" + p2.toString());
       		
       		setFirstName.invoke(p2, "Bill");
       		setLastName.invoke(p2, "Gates");
       		setAge.invoke(p2, 65);
       		
       		System.out.println("\n" + p2.toString());
       		
       	}
       	catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException| InvocationTargetException e) 
       	{
                e.printStackTrace();
       	}
	}
}