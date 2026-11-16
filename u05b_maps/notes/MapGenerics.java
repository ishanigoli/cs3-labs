import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class MapGenerics
{
	public static void main(String args[])
	{
		Map<Integer,String> map = new TreeMap<Integer,String>();
		Map<Integer,String> map2 = new TreeMap<>();

		Map<Integer,TreeSet<String>> mapOfSets = new TreeMap<Integer,TreeSet<String>>();
		Map<Integer,TreeSet<String>> mapOfSets2 = new TreeMap<>();
		//Map<Integer,Set<String>> mapOfSets = new TreeMap<Integer,TreeSet<String>>();


	}
}

