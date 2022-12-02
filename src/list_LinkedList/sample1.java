package list_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class sample1 
{
public static void main(String[] args) 
{
	LinkedList list = new LinkedList();
	
	list.add("yogesh");
	list.add("sayali");
	list.add("madhuri");
	list.add("yogesh");
	list.add(null);
	list.add(546);
	list.add(null);
	
	System.out.println(list);
	
	System.out.println(list.size());
	
	list.addFirst("swapnil");
	System.out.println(list);
	list.addLast("yogesh");
	System.out.println(list);
	
	list.add("yoga");
	System.out.println(list);
	
	list.add(5,56546);
	System.out.println(list);
	
	//right shifting operation -add 
	
	list.add(6,"raj");
	System.out.println(list);
	
	//left shifting operation - add 
	
	list.remove();
	list.remove(5);
	System.out.println(list);
	
	//modify
	
	list.set(5,"mi");
	System.out.println(list);
	
	System.out.println("--print all info using iteratore curser---");
	Iterator it = list.iterator();
	
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
	
	System.out.println("--print all info using list iteratore curser---");
	ListIterator lit = list.listIterator();
	
	while(lit.hasNext()) 
	{
		System.out.println(lit.next());
	}
	System.out.println("--print all info using foreach curser---");
	
	for(Object ob:list)
	{
		System.out.println(ob);
	}
	
}
}
