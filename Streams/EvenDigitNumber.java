import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenDigitNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(555,90,482,1771);
		list.stream().filter(i -> i%2==0).forEach(System.out::println);
		List<Integer> result = list.stream().filter(n -> String.valueOf(n).length()%2==0).collect(Collectors.toList());
		long res = list.stream().filter(n -> String.valueOf(n).length()%2==0).count();
//		System.out.println(result.size());
		System.out.println(res);
	}

}
