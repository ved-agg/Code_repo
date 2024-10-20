import java.util.Arrays;
import java.util.stream.Collectors;

public class ReversString {

	public static void main(String[] args) {
		String input = "Java articles are Awesome";
//		String str = Arrays.stream(input.split(""))
//		.reduce("",(a,b)->b+a);
		String str = Arrays.stream(input.split(" "))
				.reduce(" ",(a,b)->b+" "+a).trim();
		System.out.println(str);
	}

}
