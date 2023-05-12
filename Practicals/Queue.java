package Collection;
import java.util.*;
import java.util.LinkedList;

public class Queue {

	public static void main(String[] args)
	{ 
		//create an object of queue interface
		Queue<Integer> q = new LinkedList<>();
		//add elements
		for(int i=0;i<5;i++)
		{
			q.add(i);
			
		}
		//display the elements of the queue
		System.out.println("Elements Of Queue:"+q);
		
		//to remove the head of queue
		int r = q.remove();
		System.out.println("Remove Elements is:"+r);
		System.out.println("Elements Of Queue:"+q);  //after removal
		
		//to view the head element of queue
		int h=q.peek();
		System.out.println("Head of Queue:"+h);
		
		//size of queue
		
		int s=q.size();
		System.out.println("Size of Queue:"+s);
		

	}

}
