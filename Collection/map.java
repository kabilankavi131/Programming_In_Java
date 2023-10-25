import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> myMap = new HashMap<>();

        // Adding key-value pairs to the map
        myMap.put("Java", 1);
        myMap.put("Python", 2);
        myMap.put("C++", 3);

        // Iterating through the map
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
