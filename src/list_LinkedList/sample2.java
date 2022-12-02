package list_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class sample2 
{
public static void main(String[] args) 
{
	LinkedList linkl = new LinkedList();
	
	linkl.add("yogesh");
	linkl.add("md");
	linkl.add("mk");
	linkl.add("sk");
	linkl.add("nk");
	linkl.add("ffffhf");
	linkl.add(456);
	linkl.add(null);
	linkl.add("md");
	linkl.add(null);
	linkl.add(6523);
	linkl.add("asd");
	
	
	
	System.out.println(linkl.size());
	
	System.out.println(linkl);
	
	linkl.add(4,"yogi");
	System.out.println(linkl);
	
	linkl.remove(4);
	System.out.println(linkl);
	
	System.out.println("--print all info using iterator--");
	
	Iterator it = linkl.iterator();
	
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
	
	System.out.println("--print all info using List_iterator--");
	
	ListIterator lit = linkl.listIterator();
	
	while(lit.hasNext()) 
	{
		System.out.println(lit.next());
	}
	
	System.out.println("print using for each");
	
	for(Object ob:linkl) 
	{
		System.out.println(ob);
	}
}
}
