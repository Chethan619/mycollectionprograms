package collectionprograms;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistClassaddmethod_june25 
{
	public static void main(String[] args) 
    {
		LinkedList l1=new LinkedList();
		//indexing
		l1.add("Red");
		l1.add("Manish");
		l1.add("Cool");
		l1.add("Water");
		l1.add("Null");
		l1.add("Null");
		l1.add("Cool");
		l1.add("Cool");
		Collections.sort(l1);
		System.out.println(l1);
    }
}
