package multithreadingproject;
/*
 * @ManishYadav*/
class MyThread1 extends Thread
{
	//overrided method
	public void run()
	{
		//System.out.println("The Even no.s are: ");
		//traversing the value through for loop
		 for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+" :"+i);
			}
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		//System.out.println("The Odd no.s are:");
		for(int i=1;i<=10;i++)
		{
			if((i%2)!=0)
			{
				System.out.println(Thread.currentThread().getName()+" :"+i);
			}
		}
	}
}
public class Threads
{
	//main method
	public static void main(String[] args) 
	{
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();
		
		Thread t1=new Thread(mt1,"MyThread1");
		Thread t2=new Thread(mt2,"MyThread2");
		
		t1.setPriority(10);
		t2.setPriority(2);
		t1.start();
		t2.start();	
	}
}
