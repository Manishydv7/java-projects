/*In this project we have created 2 classes first is Calculator and the second one is CalculatorMain.
 * In class Calculator we have taken 2 data members, constructors, getter/setter, add(),
 * subtract, and toString() method.
 * */
package OopsProject;
//class Calculator
public class Calculator 
{
	// Invoking the add and subtract methods and returning the values
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println("addition of int a and int b value is:");
		return c;
	}
	public double add(double a,int b,int c)
	{
		double d=a+b+c;
		System.out.println("addition of double a, int b, int c value id:");
		return d;
	}
	public String add(String a, String b)
	{
		String s=a+b;
		System.out.println("addition of String a and String b value:");
		return s+"\n";
	}
			
	public int substract(int a, int b)
	{
		int c=a-b;
		System.out.println("substraction of int a and int b value is:");
		return c;
	}
	public double substract(double a, double b)
	{
		double c=a-b;
		System.out.println("substraction of double a and double b value is:");
		return c;
	}
}
