package collectionprograms;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueClassaddmethod_june25 
{
	   public static void main(String[] args) 
	    {
		   PriorityQueue p1=new PriorityQueue();
			p1.add("Red");
			p1.add("Manish");
			p1.add("Cool");
			p1.add("Water");
			// p1.add(null); if we allow this we are getting null pointer exception
			p1.add("Water");
			p1.add("Water");
			// unable to sort, if we sort it we are getting unresolved compilation problem
			System.out.println(p1);
		}
}
