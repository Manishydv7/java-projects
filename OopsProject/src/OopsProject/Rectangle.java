package OopsProject;
//class Rectangle
public class Rectangle extends Square implements Shape
{
	//data member
	public int width=20;
	
	@Override
	public int area()
	{
		int ar=length*width;
		return ar;
	}
}
