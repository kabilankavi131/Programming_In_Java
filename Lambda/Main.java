import java.lang.FunctionalInterface;

@FunctionalInterface
interface Example {
    void hey(String n);
}

public class Main {
    public static void main(String[] args) {
        Example p = (name) -> {
            System.out.println("Hello " + name + " Bro !");
        };
        p.hey("kabilan");
    }
}
