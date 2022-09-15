/*In this program BookTree we have created 2 ArrayLists and and 1 TreeSet object and then
 * we added 2 ArrayList objects into that TreeSet object
 * @Manishyadav*/
package CollectionProject;
import java.util.ArrayList;
import java.util.TreeSet;
//BookTree class
public class BookTree 
{
	public static void main(String args[]) 
	{
	 //creating first array list object
	 ArrayList<Book> list1=new ArrayList<Book>();
	 Book bt1=new Book(101,"java programming","Manish agarwal ma'am");
	 Book bt2=new Book(102,"python","Ashok sir");
	 Book bt3=new Book(103,"c#","Amitava sir");
     
	 list1.add(bt1);
	 list1.add(bt2);
	 list1.add(bt3);
	 //creating second array list object
	 ArrayList<Book> list2=new ArrayList<Book>();
	 Book bt4=new Book(104,"java script new","Sushi goel");
	 Book bt5=new Book(105,"fortran new ","Nagarjun");
	 Book bt6=new Book(106,"objective c new","E-balaguru");
	 
	 list2.add(bt4);
	 list2.add(bt5);
	 list2.add(bt6);
	 //creating TreeSet object
	 TreeSet<Book> ts=new TreeSet<Book>();
	 
	 ts.addAll(list1);
	 ts.addAll(list2);
	 //for each loop
	 for(Book bt:ts)
	 {
		 System.out.println(bt);
	 }
	}
}
