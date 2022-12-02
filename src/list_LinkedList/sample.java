package list_LinkedList;
import java.util.*;
public class sample 
{
public static void main(String[] args) 
{
	LinkedList l2 = new LinkedList();
	
	l2.add(45);
	l2.add("swap");
	l2.add("yogo");
	l2.add(45);
	l2.add("yogi");
	l2.add(null);
	l2.add('A');
	
	System.out.println(l2);
	System.out.println(l2.size());
	System.out.println(l2.contains("swap"));
	System.out.println(l2.get(2));
	System.out.println(l2.getFirst());
	System.out.println(l2.getLast());
	System.out.println(l2.hashCode());
	System.out.println(l2.indexOf("yogi"));
	System.out.println(l2.lastIndexOf('A'));
	System.out.println(l2.isEmpty());
	//System.out.println(l2.set(2,54));
	System.out.println(l2);
	
	System.out.println(l2);
	//add info in between linkedList
	l2.add(4, 500);
	System.out.println(l2);
	
	//remove/delete info in between LinkedList
	l2.remove(4);
	System.out.println(l2);
	
	//modify/update info
	l2.set(0, "Ramesh");
	System.out.println(l2);
	
	System.out.println("-----print all data using Iterator cursor ------");
    Iterator itr = l2.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("-----print all data using ListIterator cursor ------");
	ListIterator litr = l2.listIterator();
	while(litr.hasNext()) 
	{
		System.out.println(litr.next());
	}

	System.out.println("-----print all data using for loop ------");
for(int i=0; i<=l2.size()-1; i++)
{
	System.out.println(l2.get(i));
}

System.out.println("-----print all data using foreach loop ------");
for(Object s1: l2)
{
	System.out.println(s1);
}


}
}
