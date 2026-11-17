//Â© A+ Computer Science
// www.apluscompsci.com

//Stack example isEmpty

import static java.lang.System.*;
import java.util.Stack;

public class StackIteration
{
	public static void main( String args[] )
	{
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(88);
		s.push(23);
		s.push(77);
		s.push(22);				
		s.push(11);
		
      out.println("Original stack: " + s + "\n");
      for(Integer n : s)
         out.println(n);
      out.println("After iteration: " + s + "\n");
      
		while(!s.isEmpty())
		{
		   out.println(s.pop());
		}
      out.println("After popping all: " + s);
      
	}
}

