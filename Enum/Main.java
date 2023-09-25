public class Main {
    public static void main(String[] args) {
        System.out.println(days.monday.num);
        
    }
}
enum days{
    monday(1),tuesday,wednesday,thursday,friday,saturday,sunday;
    int num;
    days(int x){
        this.num=x;
    }
    days(){}
}