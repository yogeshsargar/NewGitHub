package list_ArrayList;
import java.util.*;
public class sample3
{
public static void main(String[] args)
{
	ArrayList ar1 = new ArrayList();
	ar1.add("yogesh");
	ar1.add("sayali");
	ar1.add("nutan");
	ar1.add("swapnil");
	ar1.add("yogesh");
	ar1.add(102);
	ar1.add(105);
	ar1.add('A');
	ar1.add(null);
	ar1.add("swapnil");
	ar1.add(null);
	
	System.out.println(ar1);
	System.out.println(ar1.size());
	
	Iterator itr = ar1.iterator();
	
	System.out.println("---- Iteratore print all info using while loop----");
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
	System.out.println("---- ListIteratore print all info using while loop----");
	ListIterator litr=ar1.listIterator();
	
	while(litr.hasNext()) 
	{
		System.out.println(litr.next());
	}
	
	System.out.println("----  print all info using for loop----");
	
	for(int i=0;i<=ar1.size()-1;i++)
	{
		System.out.println(ar1.get(i));
	}
	

	System.out.println("----  print all info using foreach loop----");
	
	for(Object s2:ar1) 
	{
		System.out.println(s2);
		
	}
	
	
	
	
	
	
}
}
