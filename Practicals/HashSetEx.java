package Collection;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) 
	{
		Set<String> s = new HashSet<String>();
		s.add("Ruby");
		s.add("Lisa");
		s.add("Jisso");
		s.add("Rose");
		
		//printing the elements
		System.out.println("Elements are:"+s);
		
		String c = "Jennie";
		//check weather the string is available or not
		System.out.println("Elements Contains:"+c +s.contains(c));
		
		
	}

}
