package list_ArrayList;

import java.util.ArrayList;

public class sample4 
{
public static void main(String[] args)
{
	ArrayList ar = new ArrayList();
	
	ar.add("abcd");
	ar.add(1234);
	ar.add("dada");
	ar.add("raju");
	ar.add("pappu");
	ar.add(5654);
	ar.add('A');
	ar.add(5654);
	ar.add(null);
	ar.add('A');
	ar.add(null);
	ar.add(75.5f);
	
	ar.add(null);
	
	System.out.println(ar);
	System.out.println(ar.size());
	
	boolean c = ar.contains(5654);
	System.out.println(c);
	
	System.out.println(ar.get(0));
	
	System.out.println(ar.indexOf("pappu"));
	System.out.println(ar.isEmpty());
	//System.out.println(ar.lastIndexOf(ar));
	System.out.println(ar.get(5));
	System.out.println(ar);
	
	ar.add(6, "Yogesh");
	
	System.out.println(ar);
	System.out.println(ar.size());
	
	boolean emty = ar.isEmpty();
	System.out.println(emty);
	
	ar.remove(6);
	System.out.println(ar);
	
	ar.set(6, "Yogesh");
	
	System.out.println(ar);
}
}
