package Streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
//	Given a list of integers, find the maximum value element present in it using Stream functions?
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int max = list.stream().max(Integer::compareTo).get();
		System.out.println(max);
	}

}
