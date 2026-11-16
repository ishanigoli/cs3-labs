//printing out a map with the new for loop

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import static java.lang.System.*;

public class TreeMapTraversal
{
   public static void main(String args[])
   {
      Map<String,Double> map = new TreeMap<String,Double>();
      map.put("Bobby", 4.0);  //note that 4 wouldn't work here
      map.put("Carlos", 5.0);
      map.put("Jo", 4.5);
      map.put("Hailey", 5.0);
   
      out.println("For-each Loop Using KeySet:");
      for(String name : map.keySet())
      {
         out.println(name+" - "+map.get(name));
      }
      
      out.println("\n" + "Iterator from KeySet:");
      Iterator<String> keyIter = map.keySet().iterator();
      while(keyIter.hasNext())
      {
         String name = keyIter.next();
         out.println(name+" - "+map.get(name));
      }
   
      out.println("\n" + "For-each Loop Using EntrySet:");
      for(Map.Entry entry : map.entrySet())
      {
         out.println(entry.getKey()+" - "+entry.getValue());
      }
      
      out.println("\n" + "Iterator from EntrySet:");
      Iterator<Map.Entry<String,Double>> entryIter = map.entrySet().iterator();
      while(entryIter.hasNext())
      {
         Map.Entry entry = entryIter.next();
         out.println(entry.getKey()+" - "+entry.getValue());
      }
      
      out.println("\n" + "For-each Loop Using Values:");
      for(Double age : map.values())
      {
         out.println(age);
      }
      
      out.println("\n" + "Iterator from Values:");
      Iterator<Double> valuesIter = map.values().iterator();
      while(valuesIter.hasNext())
      {
         Double age = valuesIter.next();
         out.println(age);
      }
      
      out.println("\n" + "Java 8's For-each Loop:");
      map.forEach( 
          (name, age) -> { out.println(name + " - " + age); }   //The braces aren't actually necessary
         );
      
      out.println("\n" + "Java 8's For-each Loop:");
      map.keySet().forEach( 
          name -> { out.println(name + " - " + map.get(name)); }   //The braces aren't actually necessary
         );
         
      out.println("\n" + "Java 8's Streams and entrySet:");
      map.entrySet().stream().forEach( 
         entry -> out.println(entry.getKey() + " - " + entry.getValue())
         );
   
      out.println("\n" + "Java 8's Streams and keySet:");
      map.keySet().stream().forEach( 
         name -> out.println(name + " - " + map.get(name))
         );  
   }
}

