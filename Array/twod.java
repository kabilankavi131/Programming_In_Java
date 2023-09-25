public class twod {
    public static void main(String[] args) {
        String data[][]={
            {"Kabilan K","19","Vdm"},
            {"Prabha D","19","Vdm"},
            {"Hari SK","19","Vdm"}
        };
        for(String[] details:data){
            for(String x:details){
                System.out.println(x);
            }
        }
    }
}
