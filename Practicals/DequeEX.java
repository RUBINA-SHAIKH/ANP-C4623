package Collection;
import java.util.*;
public class DequeEX {

	public static void main(String[] args)
	{
		Deque<String> dq = new ArrayDeque<>();
		//adding Elements using different methods
		dq.add("TeTe");
		dq.addFirst("Mango");
		dq.addLast("Ruby");
		dq.add("Dessert");
		
		//printing elements
		System.out.println("Elements are:"+dq);
		
		//remove & return the head of the queue
		System.out.println("Removed Element is:"+dq.pop());
		
		
		//remove & return the first element of the queue
		System.out.println("Element is:"+dq.pollFirst());
		
		//remove & return the last element of the queue
		System.out.println("Removed Element is:"+dq.pollLast());
				
				
		

	}

}
