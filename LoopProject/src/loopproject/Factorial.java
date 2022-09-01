/**In this program Factorial we are taking int value from the user to find out the factorial of that number.
 * @Manishyadav
*/
package loopproject;
import java.util.Scanner;

public class Factorial 
{
	//method factorial(int n)
	int factorial(int n)
	{
	int fact=1;
	//traversing the for loop here
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	//returning the value 
	return fact;
	}
	//main method calls here
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);	
	 System.out.println("please enter the value to find the factorial: ");
	 //taking int value from the user
	  int n=sc.nextInt();
	  Factorial f=new Factorial();
	  //caling the method factorial() and then printing that method's return value
	  System.out.println("The factorial of the "+n+"  is: "+f.factorial(n));
	}
}
	
