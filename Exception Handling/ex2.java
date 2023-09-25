public class ex2 {
    public static void main(String[] args) {
        int data[]={1,2,3,4};
        try{
            System.out.println(data[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index : "+e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}