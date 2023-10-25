import java.util.Hashtable;
import java.util.Map;

public class hashtable {
    public static void main(String[] args) {
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Java", 1);
        hashtable.put("Python", 2);
        hashtable.put("C++", 3);

        System.out.println(hashtable);
    }
}
