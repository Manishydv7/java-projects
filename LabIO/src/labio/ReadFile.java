/*In this program ReadFile we are reading a file line by line and then storing into a variable.
 * this class contains one static method named as lineByLineReading() and two String data members.
 * it also contains 1 try block and 2 catch blocks
 *@ManishYadav*/
package labio;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
//class ReadFile
public class ReadFile {
//	main method
	public static void main(String[] args) throws IOException {
		//calling the static method
		lineByLineReading();
	}
//method 
	public static void lineByLineReading()   {
		//data members
		String s_Line="";
		String s_Data="";
		
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\extra\\Greetings.txt"));
			//traversing the file till the last line by using while loop
			while(s_Line!=null)
			{
				//checking condition whether the line is null or not by using control statement if
				if(s_Line==null)
					break;
					s_Data =s_Data+ s_Line;
	                s_Line = br.readLine();
			}
	              System.out.println(s_Data);
	             br.close();
			}
		catch(FileNotFoundException e)
		{
			System.out.println("Unable to find the file");
		}
		catch(IOException e)
		{
			System.out.println("Unable to find the file");
		}
	}
}
