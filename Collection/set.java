import java.util.HashSet;
import java.util.Set;

public class set {

    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> mySet = new HashSet<>();

        // Adding elements to the set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        // Iterating through the set
        for (String fruit : mySet) {
            System.out.println(fruit);
        }
    }
}
