/**In this program StringConcatenation we have taken String st[] as an argument and 
 * returning a string containing concatenation of all the strings in the input array.
 * we have invoked the method strConcatDisplay() three times with diff. argument.
 * we have also thrown a Exception in this program in if block.
 * @Manishyadav.
 * */
package stringarrayproject;

public class StringConcatenation {
	static String strConcatDisplay(String st[])
	{
		//converting st array in StringBuilder object, for using append method
		StringBuilder builder =new StringBuilder();
		try
		{
			//here, Exception will be thrown if st is empty
			if(st==null)
			{
				throw new Exception();
			}
			//here, we have used a for each loop to join array values one by one 
			for(String s:st)
			{
				builder.append(s+" ");
			}
		}
		catch(Exception e)
		{
			//this sop statement will print a msg is the string is null
			System.out.print("The Array Cannot be null");
		}
		//this will return the method in the form of string
		return builder.toString();
	}
 public static void main(String args[])
 {
	 //three array strings
	 String str1[]=null;
	 String str2[]= {"Hey","Buddy"};
	 String str3[]= {"I", "am","Manish yadav"};
	 
	//invoking the method strConcatDisplay(String st[]) 3 times 
	 System.out.println(strConcatDisplay(str1));//will print The Array cannot be null
	 System.out.println(strConcatDisplay(str2));
	 System.out.println(strConcatDisplay(str3));
 }
}
