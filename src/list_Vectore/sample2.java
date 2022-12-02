package list_Vectore;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample2 
{
public static void main(String[] args) 
{
	Vector v1 = new Vector();
	v1.add("abcd");
	v1.add("dhtrtt");
	v1.add("rtttytt");
	v1.add("aeesdfh");
	v1.add(546);
	v1.add(null);
	System.out.println(v1);
	
	v1.add(5,"tu");
	
	boolean v = v1.isEmpty();
	System.out.println(v);
	
	
	boolean v2=v1.contains("abcd");
	System.out.println(v2);
	
	System.out.println(v1.elementAt(0));
	
int index =	v1.indexOf(546);
System.out.println(index);
System.out.println(v1.elementAt(5));

v1.remove(5);
System.out.println(v1);

System.out.println("use for loop----");
for(int i=0;i<=v1.size()-1;i++) 
{
	System.out.println(v1.get(i));
}

System.out.println("use for-each loop----");
for(Object s1:v1)
{
	System.out.println(s1);
	
}
System.out.println("using  Iteratore ----");
Iterator it = v1.iterator();

while(it.hasNext())
{
System.out.println(it.next());	
}
System.out.println("using  list-Iteratore ----");
ListIterator lit = v1.listIterator();
 while(lit.hasNext()) 
 {
	 System.out.println(lit.next());
 }
 System.out.println("using  Enumration--- ----");
 Enumeration en = v1.elements();
 
 while(en.hasMoreElements())
 {
	 System.out.println(en.nextElement());
 }

}
}
