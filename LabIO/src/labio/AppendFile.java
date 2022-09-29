/*In this program AppendFile we are appending text on the existing file Greetings which are located in 
 * extra folder on desktop.
 * this class contains one static method named as appendMethod.
 * we are also using Scanner class to take the data from the file.
 * @ManishYadav*/
package labio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//main class
public class AppendFile {
//main method
	public static void main(String[] args)
	{
		//calling the static method
		appendMethod();
	}
	public static void appendMethod()
	{
		//creating the object of file
		File f=new File("C:\\Users\\HP\\Desktop\\extra\\Greetings.txt");
		try {
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.append("  i am so curious to know about gurugram.I heard that it's a millenium city and it is also a it hub");
			
			System.out.println("Data is successfully appended in the exisiting file.......\n");
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
		}
		catch (IOException e) {
		
			e.printStackTrace();
		}
	
	}
}
