package Collection;

import java.util.*; //import java utility class

public class VectorEx {

	public static void main(String[] args)
	{

		Vector<String> v = new Vector<String>();
		
		//adding object in ArrayList
		v.add("Ruby");
		v.add("Aaki");
		v.add("lisa");
		v.add("Ruby");
		
		
		//traversing list through iterator
		Iterator IT= v.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
			



	}

}
