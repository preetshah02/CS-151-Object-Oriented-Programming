//package exercise1;

import java.io.*;
import java.util.Scanner;
/**
 *  A program that takes command line input from a user and outputs it to a file named 
 *  command_line_input.txt. As long as the user keeps entering input it should keep being 
 *  appended to the end of this file. When the user presses “@q” (without quotes) the command line 
 *  input should end and the file should be closed and saved
 * 
 * @author Preet LNU
 * @version 2022-05-18
 * 
 */
public class CreateFile 
{

    //Main method
    public static void main(String[] args) 
    {
        File myFile = null;
        FileWriter myFileWriter = null;
        
        try 
        {
            //Create Scanner class
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter texts: ");
            String input = sc.nextLine();

            //Create a new file and output text to it
            myFile = new File("command_line_input.txt");
            myFileWriter = new FileWriter(myFile);

            //Loop for checking out "@q" in the file
            while (!input.equals("@q")) 
            {
                myFileWriter.write(input + "\n");
                input = sc.nextLine();
            }
            myFileWriter.close();
            sc.close();
            System.out.println("Command Line input ended.");

        } 
        catch (IOException e) 
        {
            System.out.println("There's an error");
            e.printStackTrace();
        }
    }
}
