package io;
import java.util.Comparator;
import java.util.TreeSet;

public class ReverseTreeSet
{
	public static void main(String[] args) 
	{
        // create a new TreeSet with a custom Comparator that defines a reverse order
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        // add some elements to the set
        set.add(50);
        set.add(10);
        set.add(80);
        set.add(30);
        set.add(60);
        set.add(90);
        set.add(40);

        // print out the elements in descending order
        for (Integer i : set) 
        {
        	System.out.println(i);
        }
	}
}	
     



