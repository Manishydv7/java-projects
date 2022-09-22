package multithreadingproject;
/*
 * @ManishYadav*/
class Producer
{
	 int availableProduct=500;
	
	 synchronized public void demand(int n)
	{
	   
		if(availableProduct<n)
		{
			try
			{
				wait(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
			availableProduct-=n;
		System.out.println("availableProduct after Demand "+availableProduct);
	}
	synchronized public void supply(int n)
	{
		availableProduct+=n;
		System.out.println("availableProduct after Supply "+availableProduct);
		notify();
	}
}
class MyThreadnew1 extends Thread
{
	Producer p;
	MyThreadnew1(Producer p)
	{
		this.p=p;
	}
	public void run()
	{
		p.demand(300);
		
	}
}
class MyThreadnew2 extends Thread
{
	Producer p;
	MyThreadnew2(Producer p)
	{
		this.p=p;
	}
    public void run()
	{
		p.supply(700);
	}
}
public class DemandSupply 
{
	//main
	public static void main(String[] args) 
	{
		Producer p=new Producer();
		
		MyThreadnew1 t1=new MyThreadnew1(p);
		MyThreadnew2 t2=new MyThreadnew2(p);
		
		Thread th1=new Thread(t1,"Thread-1");
		Thread th2=new Thread(t2,"Thread-2");
		
		th1.start();
		th2.start();
		
	}
}
