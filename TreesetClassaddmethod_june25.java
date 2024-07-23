package collectionprograms;

import java.util.Collections;
import java.util.TreeSet;

public class TreesetClassaddmethod_june25 
{
    public static void main(String[] args) 
    {
    	TreeSet t1=new TreeSet();
		t1.add("Red");
		t1.add("Manish");
		t1.add("Cool");
		t1.add("Water");
		//t1.add(null); doesn't accept the null value
		// t1.add("null"); if we pass duplicate values it is not printing
		// t1.add("Cool");
		// t1.add("Cool");
		// t1.add(null); if we allow this we are getting null pointer exception
		// t1.add(11); if we pass heterogeneous values we are getting class cast exception
		// unable to sort, if we sort it we are getting unresolved compilation problem
		System.out.println(t1);
	}
}
