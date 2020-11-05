
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		
		//Create a list to find unique values using set.
		List<String> list = new ArrayList<String>();
		list.add("Monday");
		list.add("Tuesday"); 
		list.add("Wednesday"); 
		list.add("Thursday"); 
		list.add("Friday"); 
		list.add("Friday"); 
		list.add("Wednesday");
		
		//Put the list into a Set.
		Set<String> set = new HashSet<String>(list);
		
		System.out.println(set);
		
		//create HashMap
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Monday", 1);
		hashMap.put("Saturday", 3);
		hashMap.put("Wednesday", 2);
		hashMap.put("Thursday", 4);
		
		System.out.println(hashMap);
		
		//create TreeMap that sorts HashMap
		TreeMap<String, Integer> tree = new TreeMap<>();
		tree.putAll(hashMap);
		
		// a treeMap automatically takes the input of a HashMap and puts it into a sorted order based off the keys.
		// ie in this example it sorts the days in alphabetical order.
		// This means you should use a TreeMap to guarantee the order of the keys in the Map.
		System.out.println(tree);
	}
}
