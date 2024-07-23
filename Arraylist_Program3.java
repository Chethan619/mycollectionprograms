package collectionprograms;
import java.util.ArrayList;
import java.util.ListIterator;

		public class Arraylist_Program3  //backward iteration without forward iteration using the concept of listiterator program
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
				while(i1.hasPrevious())
				{
					System.out.println(i1.previous()); //backward iteration will not print
				}
			}
		}
