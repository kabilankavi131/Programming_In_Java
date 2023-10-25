import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        // Creating a LinkedList (which implements Queue)
        Queue<String> myQueue = new LinkedList<>();

        // Adding elements to the queue
        myQueue.add("Task 1");
        myQueue.add("Task 2");
        myQueue.add("Task 3");

        // Removing and processing elements from the queue
        while (!myQueue.isEmpty()) {
            String task = myQueue.poll();
            System.out.println("Processing: " + task);
        }
    }
}
