import java.io.File;

public class delete {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        if (file.delete()) {
            System.out.println("The deleted file is: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}