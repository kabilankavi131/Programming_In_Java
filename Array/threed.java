public class threed {
    public static void main(String[] args) {
        String data[][][] = {
                {
                        { "Kabilan K", "19", "Vhss" },
                        { "Jhon D", "20", "Oxford" },
                        { "Michael L", "21", "Cambridge" }
                },
                {
                        { "Kabilan K", "TCS", "40000" },
                        { "Jhon D", "Accenture", "70000" },
                        { "Michael L", "IBM", "80000" }
                }
        };
        for (String[][] outer : data) {
            for (String[] inner : outer) {
                for (String values : inner) {
                    System.out.println(values);
                }
            }
        }
    }
}
