
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileInput 
{
    public static void main(String args[]) throws FileNotFoundException
    {
    	File myTxt = new File("quote.txt");
    	Scanner sc = new Scanner(myTxt);
    	
    	while(sc.hasNextLine())
    	{
    		String line = sc.nextLine();
    		System.out.println(line);
    	}
    }
    
}
