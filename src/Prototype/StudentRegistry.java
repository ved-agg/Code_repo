package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	Map<String, Student> map = new HashMap<String, Student>();
	
	Student get(String key) {
		return map.get(key);
	}
	
	void register(String key, Student value) {
		map.put(key, value);
	}
}