/*In this program Palindrome we are taking String values values from class PalindromeTest methods
* and we are checking whether a String is palindrome or not.*/
package junitlabtestmain;
//main class
public class Palindrome1 {

	//method checking whether a string is palindrome or not
	public static boolean isPalindrome(String str)
	{
		String rev="";
		//for loop for reversing the string
	for(int i=str.length()-1;i>=0;i--)
		{
		 rev=rev+str.charAt(i);
		}
	//checking whether a string is palindrome or not
		if(str.equals(rev))
			return true;
		else 
			return false;
	}
}

