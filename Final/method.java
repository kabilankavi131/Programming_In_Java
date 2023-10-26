public class method {
    public static void main(String[] args) {
        Derived d=new Derived(12);
        d.printValue();
    }
}


class Example{
    Example(int n){
        num=n;
    }
    int num;
    final void updateNum(){
        this.num+=1;
    }
    void printValue(){
        System.out.println(num);
    }
}
class Derived extends Example{
    // void updateNum(){  It will cause error bcoz it is defined as final method in base class !

    // }
    Derived(int n){
        super(n);
    }
}