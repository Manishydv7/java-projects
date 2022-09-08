package OopsProject;
//class ShapeMain
public class ShapeMain 
{
	public static void main(String args[])
	{
		//Creating a object of Square class
		Square s=new Square();
		//calling the method area() with reference of Square class object s
		s.area();
		System.out.println("The area of the square is : "+s.area());
		//Creating a object of Rectangle class
		Rectangle r=new Rectangle();
		//calling the method area() with reference of Rectangle class object r
		r.area();
		System.out.println("The area of the rectangle is : "+r.area());
	}
}
