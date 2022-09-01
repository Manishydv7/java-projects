/**In this program CountCharInString we are taking the input from the user in the form of String and
 * then counting how many char that String contains excluding white spaces.
 * @Manishyadav*/
package loopproject;
import java.util.Scanner;

public class CountCharInString 
{
	//main method calls here
 public static void main(String args[])
 {
	char choice='y';
	while(choice=='y')
	{
	 Scanner sc=new Scanner(System.in);
	 int count=0;
	System.out.println("Enter the String to check: ");
	//taking String as an input by the user
	String str=sc.nextLine();
	char[] c=str.toCharArray();
	//for loop traversing the value of char array 'c'
	for(int i=0;i<c.length;i++)
	{
		if(c[i]!=' ')
		{
		  count++;
		}
	}
	System.out.println("Total number of char in the String are: "+count);
	System.out.println("Do you want to continue y/n: ");
	//giving user a condition to continue or not 
	choice=sc.next().charAt(0);
	}
 }
}
