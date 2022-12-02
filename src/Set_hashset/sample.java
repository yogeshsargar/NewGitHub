package Set_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class sample 
{
public static void main(String[] args)
{
	HashSet hs=new HashSet();
	
	hs.add(120);
	hs.add("yogesh");
	hs.add(null);
	hs.add(120);
	hs.add("yogayog");
	hs.add(null);
	hs.add("yogesh");
	
	ArrayList ar = new ArrayList(hs);
	
	System.out.println(ar.get(1));
	System.out.println(ar.get(0));
	
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.contains(120));
	System.out.println(hs.isEmpty());
  
	System.out.println(hs);
	
	System.out.println("--print all data from hashset using Iterator--");
	Iterator itr = hs.iterator();
	
	while(itr.hasNext())
			{
		System.out.println(itr.next());
	}
	System.out.println("--print all data from hashset using foreach--");
	for(Object s1:hs) {
		System.out.println(s1);
	}
	
}
}
