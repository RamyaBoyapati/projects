import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateValuesFromMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(3, "Grapes");
		map.put(4, "Apple");
		map.put(5,"Peer");
		System.out.println("Original Map: " + map);
		// Create a HashSet to store unique values
		Set<String> uniqueValues = new HashSet<>();
		// Use an Iterator to traverse the Map and remove duplicate values
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
		 Map.Entry<Integer, String> entry = it.next();
			if (!uniqueValues.add(entry.getValue())) {
			it.remove();
			}
			}
		System.out.println("Map with Duplicate Values Removed: " + map);
	}
}