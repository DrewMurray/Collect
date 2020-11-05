
import java.util.HashMap;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		
		//create HashMap
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Monday", 1);
		hashMap.put("Saturday", 3);
		hashMap.put("Wednesday", 2);
		hashMap.put("Thursday", 4);
		
		System.out.println(hashMap);
		
		//create TreeMap to sort HashMap
		TreeMap<String, Integer> tree = new TreeMap<>();
		tree.putAll(hashMap);
		
		// a treeMap automatically takes the input of a HashMap and puts it into a sorted order.
		System.out.println(tree);
	}
}
