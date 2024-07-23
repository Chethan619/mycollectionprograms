package collectionprograms;

import java.util.ArrayList;

public class Collection_Methods1_Programjune21 
{
	 public static void main(String[] args) 
	    {
			ArrayList a1=new ArrayList();
			a1.add("red");
			a1.add("Manish");
			a1.add("Cool");
			a1.add("water");
			a1.add(11);
			a1.add(true);
			a1.add(11.859903);
			a1.add(null);
			System.out.println("Before removal -> "+a1);
			a1.remove("red");
			System.out.println("After removal -> "+a1);
			
			ArrayList a2=new ArrayList();
			a2.addAll(a1);
			a2.add('w');
			a2.add("clock");
			a2.removeAll(a1);
			System.out.println("After removing all of a1 output is -> "+a2);	
			
	    }
}
