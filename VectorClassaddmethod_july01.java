package collectionprograms;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClassaddmethod_july01 
{
	/* public static void main(String[] args) 
    {
		Vector v1=new Vector();
		v1.add(10);
		v1.add("Manish");
		v1.add("Cool");
		v1.add(15.2);
		System.out.println(v1);
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
    } */
	
	public static void main(String[] args) 
    {
		Vector v1=new Vector();
		v1.add(10);
		v1.add("Manish");
		v1.add("Cool");
		v1.add(15.2);
		System.out.println(v1);
		v1.addElement("Red"); //add element
		System.out.println(v1);
		System.out.println(v1.firstElement()); //first element
		System.out.println(v1.lastElement()); // last element
		v1.removeElement("Cool"); //remove element
		System.out.println(v1);
		v1.removeElementAt(3); //remove element at
		System.out.println(v1);
		v1.removeAllElements(); //remove all elements
		System.out.println(v1);
		System.out.println(v1.capacity()); //capacity
    }
}
