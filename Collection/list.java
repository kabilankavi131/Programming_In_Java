import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        // Iterating through the list
        for (String language : myList) {
            System.out.println(language);
        }
    }
}
