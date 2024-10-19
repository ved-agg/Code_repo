package Streams;

public class FirstNonRepeated {

	//Given a String, find the first non-repeated character in it using Stream functions?
	public static void main(String[] args) {
		 String input = "Java articles are Awesomej";
//		 char ch = input.chars()
//		 .mapToObj(c->Character.toLowerCase(Character.valueOf((char)c)))
//		 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//		 .entrySet()
//		 .stream()
//		 .filter(entry -> entry.getValue()==1L)
//		 .map(entry -> entry.getKey())
//		 .findFirst()
//		 .get();
//		 System.out.println(ch);
		 
		 char ch = input.chars()
		 .mapToObj(c -> (char) c)
		 .filter(i-> input.indexOf(i)==input.lastIndexOf(i))
		 .findFirst()
		 .orElse(' ');
		 if(ch==' ') System.out.println("-1");
		 else
			 System.out.println(input.indexOf(ch));
		 
		System.out.println(ch);
	}

}
