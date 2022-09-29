/*In this program LongestWord we are finding the longest word from the existing text file.
 *this class contains two data members and a static method named as findLongestWords()
 *@ManishYadav
 * */
package labio;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 //main class
public class LongestWord 
{
	//main method
    public static void main(String [ ] args) throws FileNotFoundException 
    {
        new LongestWord().findLongestWords();
    }
 //method
    public String findLongestWords()
    {
    	//data members
        String longest_word = "";
        String current;
        try
        {
        	Scanner sc = new Scanner(new File("C:\\Users\\HP\\Desktop\\extra\\Greetings.txt"));
        	 //traversing file by using while loop
            while (sc.hasNext()) 
            {
                current = sc.next();
                if (current.length() > longest_word.length()) 
                {
                    longest_word = current;
                }
     
            }
            sc.close();
            System.out.println(longest_word);
        }
        catch(FileNotFoundException e)
        {
        	System.out.println(e);
        }
        //returning the longest word
        return longest_word;
    }
}
