import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapyValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("three", 3);
		map.put("four", 4);
		map.put("one", 1);
		map.put("two", 2);

		Map<String, Integer> result1 = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)->a, LinkedHashMap::new));
		System.out.println(result1);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());

		Map<String, Integer> result = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : list ) {
			result.put(entry.getKey(), entry.getValue());
		}
		System.out.println(result);
		
		Map<String, Integer> maps = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
	}

}
