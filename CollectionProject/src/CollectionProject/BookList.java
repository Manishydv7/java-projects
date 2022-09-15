/*In this class BookList we have made a static method ContainsList and created 2 ArrayList  and
 * also created 6 objects of Book pojo class.
 * Values of book class variables are assigned from Book class Constructor
 * Interface Iterator is also used
  *@ManishYadav  */

package CollectionProject;
import java.util.ArrayList;
import java.util.Iterator;

public class BookList  
{
	public static void main(String args[])
	{
		ContainsList();
	}	
	public static void ContainsList()
	{
       ArrayList list1=new ArrayList();
		
		Book ob1=new Book(101,"java programming","Manish agarwal ma'am");
		Book ob2=new Book(102,"python","Ashok sir");
		Book ob3=new Book(103,"c#","Amitava sir");
		
		ArrayList list2=new ArrayList();
		
		Book ob4=new Book(104,"java programming new","Manish agarwal ma'am");
		Book ob5=new Book(105,"python new ","Ashok sir");
		Book ob6=new Book(106,"c# new","Amitava sir");
		
		list1.add(ob1);
		list1.add(ob2);
		list1.add(ob3);
		
		list2.add(ob4);
		list2.add(ob5);
		list2.add(ob6);
		
		System.out.println("List1 conatining objects "+"\n");
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println("Array list1 output: "+it.next());
		}
		System.out.println("\n");
		System.out.println("List2 conatining objects "+"\n");
		Iterator it2=list2.iterator();
		while(it2.hasNext())
		{
		System.out.println("Array list2 output: "+it2.next());
		}
	}
}
