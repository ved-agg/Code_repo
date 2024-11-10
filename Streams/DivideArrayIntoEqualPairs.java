import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*You are given an integer array nums consisting of 2 * n integers.

You need to divide nums into n pairs such that:

Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.*/

public class DivideArrayIntoEqualPairs {

	public static void main(String[] args) {
		int[] arr = {3,2,3,2,2,2};
		Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		for(Map.Entry<Integer, Long> entry: map.entrySet()) {
			if(entry.getValue()%2!=0) System.out.println(false); 
		}
		System.out.println(true);
	}

}
