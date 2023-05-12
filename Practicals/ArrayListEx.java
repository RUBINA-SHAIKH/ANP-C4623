package Collection;
import java.util.*; //import java utility class
public class ArrayListEx {

	public static void main(String[] args)
	{
		ArrayList<String> arraylist = new ArrayList<String>();
		
		//adding object in ArrayList
		arraylist.add("Ruby");
		arraylist.add("Aaki");
		arraylist.add("lisa");
		arraylist.add("Ruby");
		
		
		//traversing list through iterator
		Iterator IT= arraylist.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
			

	}

}
