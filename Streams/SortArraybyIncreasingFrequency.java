import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

//Given an array of integers nums,
//sort the array in increasing order based on the frequency of the values.
//If multiple values have the same frequency, sort them in decreasing order.
public class SortArraybyIncreasingFrequency {

	public static void main(String[] args) {
		int[] array = {4, 5, 6, 5, 4, 3};
		Map<Integer, Long> frequencyMap = Arrays.stream(array)
	            .boxed()
	            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

	        int[] sortedArray = Arrays.stream(array)
	            .boxed()
	            .sorted((a, b) -> {
	                int freqCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
	                return freqCompare != 0 ? freqCompare : b.compareTo(a);
	            })
	            .mapToInt(i -> i)
	            .toArray();

	        System.out.println(Arrays.toString(sortedArray));  
		// TODO Auto-generated method stub
//		List<Integer> list = Arrays.asList(-1,1,-6,4,5,-6,1,4,1);
//		List<Integer> result = new ArrayList<>();
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i: list) {
//			map.put(i, map.getOrDefault(i, 0)+1);
//		}
//		System.out.println(map);
//		Map<Integer, Integer> maps = map.entrySet().stream().sorted((a, b)-> {
//			int comp = b.getValue().compareTo(a.getValue());
//			if(comp==0) return b.getKey().compareTo(a.getKey());
//			else return comp;
//		}
//)
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
//		System.out.println(maps);
//		
//		PriorityQueue<Map.Entry<Integer, Integer>> pq;
//		pq = new PriorityQueue<>((a,b) ->a.getValue()-b.getValue());
//		pq.addAll(map.entrySet());
//		while(!pq.isEmpty()) {
//			Map.Entry<Integer, Integer> entrySet=pq.poll();
//			for(int i=0;i<entrySet.getValue();i++) {
//				result.add(entrySet.getKey());
//			}
//		}
//		System.out.println(result);
	}
}
