package Set_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class sample1
{
public static void main(String[] args) 
{
	
	ArrayList al=new ArrayList();     
	al.add("Rahul");
	al.add(101);
	al.add('A');
	al.add(65.5f);
	al.add("Rahul");
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	
	HashSet hs1=new HashSet(al);
	System.out.println(hs1);
	
System.out.println(hs1.isEmpty());
System.out.println(hs1.contains("Rahul"));

  Iterator it=hs1.iterator();
  
  while(it.hasNext()) 
  {
	  System.out.println(it.next());
  }
  
 
	
	
	
}
}
