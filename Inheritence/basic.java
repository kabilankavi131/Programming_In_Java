class Dad{
    String name;
    int age;
    void anger(){
        System.out.println("So Angryy.....");
    }
}

class Mom{
    String name;
    int age;
    void calm(){
        System.out.println("So Calm...");
    }
}

class Son extends Mom{
     void clever(){
        System.out.println("Son is so clever :-)");
     }
}

public class basic {
    public static void main(String[] args) {
        Son s=new Son();
        s.calm();
        s.clever();
    }
}
