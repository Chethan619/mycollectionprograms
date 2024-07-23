package collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_program //how to do iteration for arraylist program which iterates only in the forward direction
{
    public static void main(String[] args) 
    {
		ArrayList a1=new ArrayList();
		a1.add("Reddy");
		a1.add("Ram");
		a1.add(11);
		System.out.println(a1);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
