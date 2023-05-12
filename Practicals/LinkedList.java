package Collection;

import java.util.*;


public class LinkedList {

	public static void main(String[] args)
	{
		
       LinkedList<Integer> lt = new LinkedList<Integer>();
		
		//adding object in LinkedList
       
		lt.add(7);
		lt.add(9);
		lt.add(10);
		lt.add(7);
		lt.add(5);
		lt.add(8);
		lt.add(3);
		
		System.out.println("Original List:"+lt);
		
		System.out.println("Sorted List:"+lt);
		
		
		//traversing list through iterator
		Iterator IT= lt.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}

	}

}
