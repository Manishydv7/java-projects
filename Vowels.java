/*
 * @author Manish yadav
 * Create a method named countVowels that taken String as input and convert it into  an array of
characters  and returns the number of vowels in the array.
Furthermore, the method should throw a checked exception if the
array contains the letter 'x'.
 */
package lab3assignment;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {

	    
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string");
	    String str= sc.nextLine();
	    char[] c = str.toCharArray(); 
	    int count=0;
		for (int i=0;i<c.length;i++) {
			System.out.print(c[i]);
			
				if(c[i]=='a' || c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u' )
				{
				count++;	
				}
		}
		try {
			int i=0;
			if(c[i]=='x') {
				System.out.println("character x is invalid");
				
			}}
			catch(Exception e) {
				System.out.print(count);
		}
		

}}