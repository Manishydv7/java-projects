package multithreadingproject;
/*
 * @ManishYadav*/
class FibSeriesAndRevOrder extends Thread
{
	synchronized public void run()
	{
		System.out.println("The fibonacci series till 10 terms is : "+fibseries(10));
		System.out.println("The reverse order terms are in the following way : ");
		revorder();
	}
	//method
	int fibseries(int n)
	{
		int no1=0,no2=1;
		int no3=0;
		for(int i=1;i<=n;i++)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
		}
		return no3;
	}
	//method
	void revorder()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
public class FiboRevThread 
{
	//main method
	public static void main(String[] args) 
	{
		FibSeriesAndRevOrder ob=new FibSeriesAndRevOrder();
		Thread t1=new Thread(ob,"MyThread1");
		t1.start();
	}
}
