//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
 private String exp;


 public SyntaxChecker()
 {
 }


 public SyntaxChecker(String s)
 {
   setExpression(s);
 }
  public void setExpression(String s)
 {
   exp = s;
 }


 public boolean checkExpression()
 {
     //You can change this to a stack of Strings if you prefer.
   Stack<String> symbols = new Stack<String>();
   String[] item = exp.split("");
   String open = "([{<";
   String close = ")]}>";
   for(String ch : item) {
     if(open.contains(ch) && !ch.isEmpty()) {
       symbols.push(ch);
     }
     else if(close.contains(ch) && !ch.isEmpty()) {
       if(symbols.isEmpty()) {
         return false;
       }
       String top = symbols.pop();
       if(open.indexOf(top)!=close.indexOf(ch)) {
         return false;
       }
     }
   }    
   return symbols.isEmpty();
 }


 public String toString() {
   if(checkExpression()) {
     return exp + " is correct.";
   }
   return exp + " is incorrect.";
 }
 //write a toString method
}
