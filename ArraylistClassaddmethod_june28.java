package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistClassaddmethod_june28 
{
	public static void main(String[] args) 
    {
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Manish");
		a1.add("Cool");
		a1.add("Water");
		System.out.println(a1);
		int i1=a1.indexOf("Cool"); //indexOf is used to find the index of the object
		System.out.println(i1);
		System.out.println(a1.get(2)); //get is used to fetch the data/element
		
		ArrayList a2=new ArrayList();
		a2.add("Red");
		a2.add("Manish");
		a2.add("Cool");
		a2.add("Water");
		System.out.println(a2);
		a2.set(1, "Cool"); //set is used to replace the data/element
		System.out.println(a2);
	
    }
}
