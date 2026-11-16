//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
 private Map<String,Integer> histogram;
 private String sentence;


 public Histogram()
 {
 }


 public Histogram(String sent)
 {
   histogram = new TreeMap<String, Integer>();
   sentence = sent;
   setSentence();
 }
  public void setSentence()
 {
   Scanner chopper = new Scanner(sentence);
   while (chopper.hasNext())
   {
     String word = chopper.next();
     if (histogram.containsKey(word))
     {
       histogram.put(word, histogram.get(word) + 1);
     }
     else
     {
       histogram.put(word, 1);
     }
   }


 }


 public String toString()
 {
   String output = "111111";
   output+= "\nchar    123456789012345";
   for (String key : histogram.keySet())
   {
     String allStars = "";
     int count = histogram.get(key);
     for (int i = 0; i < count; i++)
     {
       allStars += "*";
     }
     output += "\n" + key + "\t" + allStars + "\n";
   }
   return output + "\n\n";
 }
}


