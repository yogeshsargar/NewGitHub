package list_ArrayList;
import java.util.*;
public class sample 
{
public static void main(String[] args)
{
	ArrayList al = new ArrayList();
	al.add("yogesh");
	al.add(100);      // hetragenious in nature
	al.add('A');   // storage type is index
	al.add(null);      // space reservation allowed
	al.add("yogesh");  // duplication allowed
	al.add(null);  // any no.of reserved spaces(null)allowed
	al.add(45.25f);// order is maintained
	
	
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.contains("yogesh"));
	System.out.println(al.get(6));
	
	System.out.println("-----------------");
	// add info beetween arraylist  ---->right shift operation
	System.out.println(al);
	al.add(4,"MK");
	
	System.out.println(al);
	
	System.out.println("-------------------");
	// remove info beetween arraylist----->left shift operation
	al.remove("MK");
	System.out.println(al);
	System.out.println("---------------------------------------------");
	//update/modify info from arraylist
			al.set(1, 102);
			System.out.println(al);
			
			System.out.println("--print all info from arraylist using iterator cursor---");
			
			Iterator itr =  al.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("--print all info from arraylist using ListIterator cursor---");
			
	ListIterator litr =	al.listIterator();
	
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("--print all data using for loop---");
	
	for(int i=0;i<=al.size()-1;i++) 
	{
		System.out.println(al.get(i));
	}
	
	
	System.out.println("--print all data using for-each loop---");
	
	for(Object s1:al) 
	{
		System.out.println(s1);
	}
	
	
	
}
}
