package OopsProject;
//CalculatorMain class
public class CalculatorMain 
{
	public static void main(String args[])
	{
		//Creating of Calculator class object
		Calculator c=new Calculator();
		
		System.out.println("Additon methods: ");
		//Invoking the methods for addition
		System.out.println(c.add(10,10));
		System.out.println(c.add(20.20, 20, 20));
		System.out.println(c.add("30",  "30"));
		
		System.out.println("Substraction methods: ");
		//Invoking the mehtods for substraction
		System.out.println(c.substract(50, 40));
		System.out.println(c.substract(55.55, 55.44));
	}
}
