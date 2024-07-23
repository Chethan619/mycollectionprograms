package collectionprograms;

import java.util.Collections;
import java.util.Vector;

public class VectorClassaddmethod_june25 
{
	public static void main(String[] args) 
    {
		Vector v1=new Vector();
		//indexing
		v1.add("Red");
		v1.add("Manish");
		v1.add("Cool");
		v1.add("water");
		v1.add("null");
		v1.add("null");
		v1.add("Cool");
		v1.add("Cool");
		Collections.sort(v1);
		System.out.println(v1);
    }
}
