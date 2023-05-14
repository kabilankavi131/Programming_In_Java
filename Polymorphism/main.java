class BatsMan{
    protected int runs;
    void setRuns(int data){
        runs=data;
    }
}

class Kholi extends BatsMan{
    void printRuns(){
        System.out.println("Kholi Runs : "+runs);
    }
}

class Dhoni extends BatsMan{
    void printRuns(){
        System.out.println("Dhoni Runs : "+runs);
    }
}

 public class main {
    public static void main(String args[]){
        Kholi k=new Kholi();
        Dhoni d=new Dhoni();
        BatsMan b1=k;
        BatsMan b2=d;
        b1.setRuns(122);
        b2.setRuns(133);
        k.printRuns();
        d.printRuns();
    }
}
