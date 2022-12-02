package list_Vectore;
import java.util.*;
public class sample 
{
public static void main(String[] args) 
{
	Vector v = new Vector();
	
	v.add("swap");
	
	v.add("yogo");
	v.add("rani");
	v.add(105);
	v.add(526);
	v.add("yogo");
	v.add(145);
	v.add(null);
	v.add(null);
	
	System.out.println(v.capacity());
	System.out.println(v);
	System.out.println(v.isEmpty());
	System.out.println(v.contains("yogo"));
	System.out.println(v.elementAt(2));
	System.out.println(v.firstElement());
	System.out.println(v.get(5));
	System.out.println(v.get(4));
	
	System.out.println("---print using iteratore---");
Iterator	v1 =v.iterator();

while(v1.hasNext()) 
{
	System.out.println(v1.next());
}
	System.out.println("-- print using listiteratore---");
	
	ListIterator v2=v.listIterator();
	
	
	while(v2.hasNext()) 
	{
		System.out.println(v2.next());
		
	}
	
	System.out.println("-- print using Enumeration---");
	
	Enumeration v3=v.elements();
	
	while(v3.hasMoreElements()) 
	{
		System.out.println(v3.nextElement());
	}
	
	System.out.println("-- print using for loop---");
	
	for(int i=0;i<=v.size()-1;i++) 
	{
		System.out.println(v.get(i));
		
	}
	
	System.out.println("-- print using foreach loop---");
	
	for(Object s3:v)
	{
		System.out.println(s3);
		
	}
	
	
	
	}
	
	
		
	
}

