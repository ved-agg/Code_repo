package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

//Given an array of integers nums,
//sort the array in increasing order based on the frequency of the values.
//If multiple values have the same frequency, sort them in decreasing order.
public class SortArraybyIncreasingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,1,2,2,2,3);
		List<Integer> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i: list) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		Set<Integer> set = new HashSet<>(map.values());
		PriorityQueue<Map.Entry<Integer, Integer>> pq;
		boolean flag=true;
		if(set.size()!=map.size()) flag = false;
		pq = new PriorityQueue<>((a,b) ->a.getValue()-b.getValue());
//		else 
//			pq = new PriorityQueue<>((a,b) ->b.getValue()-a.getValue());
		pq.addAll(map.entrySet());
//		System.out.println(pq);
		while(!pq.isEmpty()) {
			Map.Entry<Integer, Integer> entrySet=pq.poll();
			for(int i=0;i<entrySet.getValue();i++) {
				result.add(entrySet.getKey());
			}
		}
		System.out.println(result);
	}
}
