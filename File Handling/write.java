import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Files in Java are seriously good!!");
            writer.close();
            System.out.println("Successfully has been written.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}