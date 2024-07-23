package collectionprograms;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedhashsetClassaddmethod_june25 
{
     public static void main(String[] args) 
    {
    	 LinkedHashSet l1=new LinkedHashSet();
			l1.add("Red");
			l1.add("Manish");
			l1.add("Cool");
			l1.add("Water");
			l1.add(null); // accepting only one null
			l1.add(null);
			l1.add("Cool");
			l1.add("Cool");
			l1.add(11);
			
			// unable to sort, if we sort it we are getting unresolved compilation problem
			System.out.println(l1);
	}
}
