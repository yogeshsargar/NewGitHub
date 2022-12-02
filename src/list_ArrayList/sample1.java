package list_ArrayList;
import java.util.*;
public class sample1
{
public static void main(String[] args) 
{
	ArrayList l = new ArrayList();
	
	l.add("Yogesh");
	l.add("sayo");
	l.add(456);
	l.add(361);
	l.add('A');
	l.add('C');
	l.add(45.26f);
	l.add(65.25f);
	l.add(null);
	l.add(null);
	l.add("Yogesh");
	
	
	
	
	System.out.println(l);
	System.out.println(l.size());
	System.out.println(l.contains("sayo"));
	System.out.println(l.get(9));
	System.out.println(l.isEmpty());
	System.out.println(l.indexOf("sayo"));
	System.out.println(l.size());
	
	System.out.println("--print all info from arraylist using iterator cursor---");
	
	Iterator it = l.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	System.out.println("--print all info from arraylist using listiterator cursor---");
	ListIterator lit = l.listIterator();
	
	while(lit.hasNext()) 
	{
		System.out.println(lit.next());
	}
	
	

	System.out.println("--print all info from arraylist using for loop---");
	for(int i=0;i<=10;i++)
	{
		System.out.println(l.get(i));
	}
	System.out.println("--print all info from arraylist using foreach loop---");
	
	for(Object s:l)
	{
		System.out.println(s);
	}
	
	
	
	
	
	
}
}
