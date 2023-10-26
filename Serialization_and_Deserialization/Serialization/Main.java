import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
public class Main {

   public static void main(String[] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;

      try {
         FileOutputStream fileOut = new FileOutputStream(
               "D:\\Github Repositories\\Algorithms_Using_Java\\Serialization_and_Deserialization\\employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved as employee.ser\n");
      } catch (IOException i) {
         i.printStackTrace();
      }
      long serialVersionUID = ObjectStreamClass.lookup(e.getClass()).getSerialVersionUID();
      System.out.println("serialVersionUID: " + serialVersionUID);

   }
}
