package collectionprograms;

import java.util.Collections;
import java.util.HashSet;

public class HashsetClassaddmethod_june25 
{
     public static void main(String[] args) 
    {
    	 HashSet h1=new HashSet();
			h1.add("Red");
			h1.add("Manish");
			h1.add("Cool");
			h1.add("Water");
			h1.add(null); // accepting only one null
			h1.add(null);
			h1.add("Cool");
			h1.add("Cool");
			h1.add(11);
			h1.add('u');
			// unable to sort, if we sort it we are getting unresolved compilation problem
			
			System.out.println(h1);
	}
}
