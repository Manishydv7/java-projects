package OopsProject;
//class Square 
public class Square implements Shape
{
	//data member
	public int length=10;
	@Override
	public int area() 
	{		
		int ar=length*length;
		return ar;
	}
	
}
