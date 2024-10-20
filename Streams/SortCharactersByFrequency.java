import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//Given a string s, sort it in decreasing order based on the frequency of the characters.
//The frequency of a character is the number of times it appears in the string.
//Return the sorted string. If there are multiple answers, return any of them.
public class SortCharactersByFrequency {

	public static void main(String[] args) {
		String str = "tree";
		Map<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		System.out.println(map);
		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
		pq.addAll(map.entrySet());
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			Map.Entry<Character, Integer> entrySet = pq.poll();
			for(int i=0;i<entrySet.getValue();i++) {
				sb.append(entrySet.getKey());
			}
		}
		System.out.println(sb);
		
		Map<Character, Long> maps = str.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
//		String s = maps.entrySet().stream()
//				.sorted(Map.Entry.comparingByValue().reversed())
//				.flatMap(entry ->)
	}

}
