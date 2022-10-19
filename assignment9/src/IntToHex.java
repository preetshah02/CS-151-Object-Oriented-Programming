import java.util.Scanner;

public class IntToHex 
{
    //Main method
    public static void main(String[] args) 
    {
        //Create Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int myNum = sc.nextInt();

        try 
        {
            System.out.println("Integer Number = " + myNum);
            System.out.println("Hexadecimal Number = " + Integer.toHexString(myNum));
        } 
        catch(NumberFormatException e) 
        {
            System.out.println("There's an error");
            e.printStackTrace();            
        }
    }
}