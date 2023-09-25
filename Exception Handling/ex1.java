public class ex1 {
    public static void main(String[] args) {
        int a=1,b=0,c;
        try{
        c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Error : "+e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
