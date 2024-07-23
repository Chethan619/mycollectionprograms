package collectionprograms;
import java.util.ArrayList;
import java.util.ListIterator;

	public class Arraylist_Program1  //listiterator can help you to iterate both in the forward direction and backward direction
	{
	    public static void main(String[] args) 
	    {
			ArrayList a1=new ArrayList();
			a1.add("Reddy");
			a1.add("Ram");
			a1.add(11);
			System.out.println(a1);
			System.out.println("-------");
			ListIterator i1=a1.listIterator();
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			System.out.println("-------");
			while(i1.hasPrevious())
			{
				System.out.println(i1.previous());
			}
		}
	}

