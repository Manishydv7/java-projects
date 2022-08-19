/**This program ExcTest handles the certain exceptions which occurs in the given code
 * @author Manish yadav */
package lab3assignment;
import java.util.Scanner;
import java.lang.Exception;
//You have to complete the code by writing down the handlers for exceptions thrown by the code.
public class ExceptionTest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two no");
		String str1=sc.nextLine();
		String str2=sc.nextLine();

		try
		{
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=a/b;
		System.out.println("value of divide by a&b:"+c);
			
	}
		catch(NumberFormatException ex)
		{
			System.out.println("format mismatch ");
		}
		catch(Exception e)
		{
			System.out.println("divide by zero is invalid division"+e);
		}
		
		finally
		{
			System.out.println("Exception encountered");
		}
		System.out.println("Exception Handling Completed");
		
		

	}}