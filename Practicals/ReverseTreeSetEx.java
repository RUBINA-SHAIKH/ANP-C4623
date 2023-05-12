package io;
import java.util.*;

public class ReverseTreeSetEx
{
	    public static void main(String[] args) 
	    {
	    
	        // Create a new TreeSet with a custom Comparator that defines a reverse order
	        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() 
	        {
	            @Override
	            public int compare(Integer o1, Integer o2)
	            {
	                return o2.compareTo(o1);
	            }
	      });

	        // Add some elements to the set
	        set.add(5);
	        set.add(10);
	        set.add(3);
	        set.add(7);
	        set.add(1);

	        // Print the elements in descending order
	        System.out.println("Elements in descending order: ");
	        for (Integer element : set)
	        {
	            System.out.println(element);}
	        }
      }

