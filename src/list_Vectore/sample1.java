package list_Vectore;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class sample1 
{
public static void main(String[] args) 
{
	Vector v1 = new Vector();
	
	v1.add("yogesh");
	v1.add(545);
	v1.add("vipul");
	v1.add("ankita");
	v1.add("yogesh");
	v1.add("nutan");
	v1.add(null);
	v1.add(null);
	v1.add("nutan");
	
	System.out.println(v1);
	
	v1.remove(4);
	System.out.println(v1);
	v1.set(6,"yogi");
	System.out.println(v1);
	
	
	System.out.println(v1.get(0));
	v1.add(7, 56546);
	System.out.println(v1);
	System.out.println(v1.size());
	
	for(Object s1:v1)
	{
		System.out.println(s1);
	}
	System.out.println("---iteratore-----");
	Iterator it =v1.iterator();
	
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
	
	ListIterator lit = v1.listIterator();
	System.out.println("---List-iteratore-----");
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
	System.out.println("---Enumration-----");
	Enumeration en = v1.elements();
	
	while(en.hasMoreElements()) 
	{
		System.out.println(en.nextElement());
	}
System.out.println("for loop-----");
	for(int i=0;i<=v1.size()-1;i++) 
	
	{
		System.out.println(v1.get(i));
	}
	
	
	
	
	
	
	
	
	

}
}
