import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilterMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, "orange");
		map.put(4, "peach");
		// Using stream to filter Map
		Map<Integer, String> filteredMap = map.entrySet()
				.stream()
				.filter(entry -> entry.getKey() % 2 == 0) // Filter by even keys
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		// Print the filtered Map
		System.out.println("Filtered Map: " + filteredMap);
	}

}
