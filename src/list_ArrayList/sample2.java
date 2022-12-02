package list_ArrayList;
import java.util.*;
public class sample2
{
public static void main(String[] args) 
{
	ArrayList ar = new ArrayList(6);
	
	ar.add("Yogesh");
	ar.add(null);
	ar.add('A');
	ar.add("sayo");
	ar.add("golya");
	ar.add("sayo");
	ar.add(null);
	
	System.out.println(ar);
	System.out.println("------add info ------ right shift---");
	
	ar.add(3,"Pooja");
	
	ar.add(5,"Madhu");
	
	System.out.println(ar);
	
	System.out.println("------remove info ------ left  shift---");
	
	
	
	
	
     ar.remove(4);
     
	System.out.println(ar);
	
	
	System.out.println("update / modify info ");
	
	ar.set(4,"Sayali");
	System.out.println(ar);
	
	
	
}
}
