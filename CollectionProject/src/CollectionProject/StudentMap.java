/*In this class StudentMap we are creating object of HashMap and then putting keys and values
 * and then comparing the vkeys and printing the values greater then 103 key*/
package CollectionProject;
import java.util.HashMap;
import java.util.Set;
//class StudentMap
public class StudentMap 
{
	//main method
	public static void main(String args[]) 
	{
		//creating object of HashMap
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(101,"Renu");
		hm.put(102,"Prince");
		hm.put(103,"Manish");
		hm.put(104,"Sheela");
		hm.put(105,"Akash");
		Set<Integer> keys=hm.keySet();
		//for each loop for traversing the values of keys
		for(Integer e:keys)
		{
			//checking condition which is greater 103
			if(e.intValue()>103)
			{
				System.out.println(hm.get(e));
			}
		}
		
	}
}
