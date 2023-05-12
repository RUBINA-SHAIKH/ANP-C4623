package Collection;

import java.util.*;


public class StackEx {

	public static void main(String[] args)
	{
          Stack<String> st = new Stack<String>();
		
		//adding object in ArrayList
		st.push("Ruby");
		st.push("Aaki");
		st.push("lisa");
		st.push("Ruby");
		st.pop();
		
		
		//traversing list through iterator
		Iterator IT= st.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		
		
	}

}
