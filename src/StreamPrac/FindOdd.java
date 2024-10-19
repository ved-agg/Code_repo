package StreamPrac;

import java.util.stream.Stream;

public class FindOdd {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3,4,10,20,34,67,87,54,43);
		stream.filter(i->i%2!=0).forEach(System.out::println);

	}

}
