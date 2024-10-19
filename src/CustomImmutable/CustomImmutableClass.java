package CustomImmutable;

import java.util.HashMap;
import java.util.Map;

public class CustomImmutableClass {

	public static void main(String[] args) {

		// Creating Map object with reference to HashMap
		Map<String, String> map = new HashMap<>();

		// Adding elements to Map object
		// using put() method
		map.put("1", "first");
		map.put("2", "second");

		Student s = new Student("ABC", 101, map);

		// Calling the above methods 1,2,3 of class1
		// inside main() method in class2 and
		// executing the print statement over them
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		System.out.println(s.getMetaData());

		// Uncommenting below line causes error
		// s.regNo = 102;

		map.put("3", "third");
		// Remains unchanged due to deep copy in constructor
		System.out.println(s.getMetaData());
		s.getMetaData().put("4", "fourth");
		// Remains unchanged due to deep copy in getter
		System.out.println(s.getMetaData());
	}
}

final class Student{
	private final String name;
	private final int regNo;
	private final Map<String, String> metaData;
	public Student(String name, int regNo, Map<String, String> metaData) {
		super();
		this.name = name;
		this.regNo = regNo;
		Map<String, String> map = new HashMap<>();
		for(Map.Entry<String, String> entry : metaData.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
		}
		this.metaData = map;
	}
	public String getName() {
		return name;
	}
	public int getRegNo() {
		return regNo;
	}
	public Map<String, String> getMetaData() {
		Map<String, String> map = new HashMap<>();
		for(Map.Entry<String, String> entry : this.metaData.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}
	
	
}