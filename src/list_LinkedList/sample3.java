package list_LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class sample3 
{
public static void main(String[] args)
{
	LinkedList ls = new LinkedList();
	
	ls.add("yogesh");
	ls.add(5456);
	ls.add(856);
	ls.add("nutan");
	ls.add("yogesh");
	ls.add(5456);
	ls.add(true);
	ls.add(5654);
	ls.add(null);
	ls.add(null);
	ls.add(false);
	ls.add(null);
	ls.add("gauri");
	System.out.println("------------------------------------------");
	System.out.println(ls);
	
	System.out.println("------------------------------------------");
	HashSet s3 = new HashSet(ls);
	System.out.println(s3);
	

	System.out.println("------------------------------------------");
	
	LinkedHashSet s4 = new LinkedHashSet(ls);
	System.out.println(s4);
	
	
	System.out.println("------------------------------------------");
	
	
	
System.out.println(ls);
System.out.println(ls.size());

ls.addFirst("my");
ls.addLast("you");

ls.set(5, "tu");
System.out.println(ls);
System.out.println(ls.size());

System.out.println(ls.get(2));

System.out.println(ls.getFirst());
System.out.println(ls.getLast());
System.out.println(ls.hashCode());

boolean em = ls.isEmpty();
System.out.println(em);

boolean con = ls.contains("nutan");
System.out.println(con);
System.out.println("-----FOR EACH LOOP----");

for(Object s2:ls) 
{
	System.out.println(s2);
}
System.out.println("-----using Iteratore curser----");
 Iterator it = ls.iterator();

 while(it.hasNext()) 
 {
	System.out.println(it.next());
}

 System.out.println("-----using List-Iteratore curser----");
 
 ListIterator lit = ls.listIterator();
 
 while(lit.hasNext()) 
 {
	 System.out.println(lit.next());
 }
 System.out.println("-----FOR  LOOP----");
 for(int i=0;i<=ls.size()-1;i++) 
 {
	 System.out.println(ls.get(i));
 }
}
}
