package collectionprograms;

import java.util.ArrayList;

public class Collection_Methods2_Programjune21 
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
		a1.size();
		System.out.println("The total size is -> "+a1.size());
		a1.remove("red");
		System.out.println("The total size after removal of red is -> "+a1.size());
		
		ArrayList a2=new ArrayList();
		a2.add(11);
		a2.add('w');
		a2.add("clock");
		System.out.println("Before clearing -> "+a2);
		a2.clear();
	    System.out.println("After clearing ->" +a2);
		
    }
}
