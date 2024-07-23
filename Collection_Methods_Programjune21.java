package collectionprograms;

import java.util.ArrayList;

public class Collection_Methods_Programjune21
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
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add('w');
		a2.add("clock");
		System.out.println(a2);	
		System.out.println(a2.contains("red"));
		System.out.println(a2.containsAll(a1));
		System.out.println(a2.isEmpty());
		
	}
}
