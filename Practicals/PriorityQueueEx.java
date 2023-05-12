package Collection;
import java.util.*;
public class PriorityQueueEx {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//adding object in LinkedList


		 
	      pq.add(7);
	      pq.add(9);
	      pq.add(10);
	      pq.add(7);
	      pq.add(5);
	      pq.add(8);
	      pq.add(3);

	       //display the elements of the queue
			System.out.println("Total Elements Of are:"+pq);
			
			//printing the top element
			System.out.println("Top Elements is:"+pq.peek());  //after removal
			
			//to remove the head of queue
			System.out.println("Remove Elements is:"+pq.poll());
			
			
			System.out.println("Total Elements are:"+pq);  //after removal
			
		
	}

}
