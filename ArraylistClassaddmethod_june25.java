package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistClassaddmethod_june25 
{
	public static void main(String[] args) 
	    {
			ArrayList a1=new ArrayList();
			a1.add("Red");
			a1.add("Manish");
			a1.add("Cool");
			a1.add("Water");
			a1.add("Water");
			a1.add("Water"); // it only accepts all the string values or all the int values if we give both then will get class cast exception
            Collections.sort(a1);
			System.out.println(a1);
			
		
	    }
}
