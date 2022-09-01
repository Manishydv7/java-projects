/**In this program Table Printing we are proving a option to user to input a number whose table
*he/she has to find.
*@Manishyadav*/
package loopproject;
import java.util.Scanner;

public class TablePrinting 
{
 //main method calls here
 public static void main(String args[])
 {
	 char c='y';
	 while(c=='y')
	 {
	 Scanner sc = new Scanner(System.in);  
	 System.out.print("Enter the number to find the table of: ");        
	 //taking a integer value from the user
	 int n=sc.nextInt();  
	 //traversing of for loop starts from here
	 for(int i=1; i <= 10; i++)  
	 {    
	 System.out.println(n+" * "+i+" = "+n*i);  
	 }  
	 //providing a option to user that he/she want to continue or not
	 System.out.println("Do you want to continue (y/n): ");
	 //taking a char value from a user
	 c=sc.next().charAt(0);
	 }
 }
}
