package list_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class practise
{
public static void main(String[] args) 
{
	ArrayList ar = new ArrayList();
	
	ar.add("yogesh");
	ar.add(454);
	ar.add(null);
	ar.add("yogesh");
	ar.add(null);
	ar.add(123);
	ar.add(23);
	ar.add(null);
	
	
	System.out.println(ar.get(0));
	System.out.println(ar.isEmpty());
	System.out.println(ar.get(6));
int size=	ar.size();
	
	System.out.println(ar);
	ar.set(5, "velocity");// no shifting
	
	System.out.println(ar);
	
	ar.add(5,"hii");// right shift
	System.out.println(ar);
	
	ar.remove(5);//left shift
	System.out.println(ar);
	
	System.out.println("----using iteratore curser----");
	
	Iterator it =  ar.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("----using List-iteratore curser----");
	ListIterator lit = ar.listIterator();
	
	while(lit.hasNext()) 
	{
		System.out.println(lit.next());
	}
	System.out.println("----for loop----");
	
	for(int i=0 ;i<=size-1;i++) 
	{
		System.out.println(ar.get(i));
	}
	
	System.out.println("----for-each loop----");
	
	for(Object s:ar) 
	{
		System.out.println(s);
	}
	
	
	
	
}


}
