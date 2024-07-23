package collectionprograms;

import java.util.Stack;

public class StackClassaddmethod_july01 
{
	public static void main(String[] args) 
    {
		Stack s1=new Stack();
		s1.add(10);
		s1.add("Manish");
		s1.add("Cool");
		s1.add(15.2);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.peek();
		System.out.println(s1);
		s1.push(33);
		System.out.println(s1);
    }
}
