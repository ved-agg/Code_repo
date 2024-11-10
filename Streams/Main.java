import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 2);
        map.put("two", 2);
        map.put("three", 1);
        map.put("four", 4);

        Map<String, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted((e1, e2) -> {
                int valueCompare = e2.getValue().compareTo(e1.getValue());
                if (valueCompare == 0) {
                    return e2.getKey().compareTo(e1.getKey());
                }
                return valueCompare;
            })
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        sortedMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
