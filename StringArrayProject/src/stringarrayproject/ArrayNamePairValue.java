/**In this program ArrayNamePairValue  we have created two arrays the first one is containing the 
 * String values and the another one is containing the int values then then we have shown the 
 * values in value pairs in a table.
 * @Manishyadav
 * */
package stringarrayproject;

import java.util.Arrays;

public class ArrayNamePairValue 
{
	void display()
	{
		//assigning value to string array
	    String[] str={"Peter", "Amy", "John", "Boyd", "Cathy"};
		//assigning value to int array
	    int[] arr={15,  9, 14, 10, 12};
		//sorting the string according to the ascending order of alphabet
		Arrays.sort(str);
	    //sorting in the numbers in the ascending order
	    Arrays.sort(arr);
			     
	    System.out.println("Name     Value");
		//printing the string and number values after sorting
		for(int i=0;i<arr.length || i<str.length ;i++)
			 {
			   System.out.println(str[i]+"     "+arr[i]);
			 }	
	}
	public static void main(String args[])
	{
		ArrayNamePairValue obj=new ArrayNamePairValue();
		obj.display();
	}
}
