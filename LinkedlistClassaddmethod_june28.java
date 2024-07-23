package collectionprograms;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistClassaddmethod_june28 
{
	public static void main(String[] args) 
    {
		LinkedList l1=new LinkedList();
		l1.add("Red");
		l1.add("Manish");
		l1.add("Cool");
		l1.add("Water");
		System.out.println(l1);
        l1.addFirst("World"); //adding first object
		System.out.println(l1);
		l1.addLast("Done"); //adding last object
		System.out.println(l1);
		l1.removeFirst(); //removing first object
		System.out.println(l1);
		l1.removeLast(); //removing last object
		System.out.println(l1);
		System.out.println(l1.getFirst()); //getting first object
		System.out.println(l1.getLast()); //getting last object
		l1.pollFirst();
		System.out.println(l1); //removing first object
		l1.pollLast();
		System.out.println(l1); //removing last object
    }
}
