//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab13a
{
	public static void main ( String[] args )
	{
		//add test cases
      StackTester test = new StackTester("a b c d e f g h i");
      out.print(test);
      test.popEmAll();
      
      StackTester test1 = new StackTester("# $ % ^ * ( ) ) _ ");
      out.print(test1);
      test1.popEmAll();
	}
}


