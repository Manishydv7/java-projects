/** In this program StringContainingX we takes String name str and returns a String repeatString of 
 * same length containing the 'X' character in all positions except the last 4 positions.
 * @Manishyadav
 * */
package stringarrayproject;
import java.util.Scanner;

public class StringContainingX {
	// Method is displaying here
	String display()
	{
		 Scanner sc=new Scanner(System.in);
		 //taking input String from the user
	       System.out.println("Enter here the String: ");
	       String str=sc.nextLine();
	       if(str.length()>4)
	       {
	    	   String allexceptlast4=str.substring(0,str.length()-4);
	    	   String repeatString="x".repeat(allexceptlast4.length());
	    	    repeatString=repeatString+str.substring(str.length()-4);
	    	   //providing the output
	    	   System.out.println(repeatString);
	       }
	       else
	       {
	    	   System.out.println("The String should be greater than four");
	       }
	       sc.close();
		   return str;
	       
		}
	public static void main(String args[])
	{
		StringContainingX  obj=new StringContainingX();
		//calling the method display()
		obj.display();
	}
}
