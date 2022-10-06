/*In this class MyArrayList we are adding random values to ArrayList named as al and then returning
 * the values*/
package junitlabtestmain;

import java.util.ArrayList;
import java.util.List;
//main class
public class MyArrayList {
	//method myArrayListMain()
	public static ArrayList<Integer> myArrayListMain() {
		//creating the object al for ArrayList
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		//returning the values of arraylist
		return al;	
	}
}

