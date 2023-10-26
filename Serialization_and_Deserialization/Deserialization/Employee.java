class Employee implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    public String name;
    public transient String address; // It won't serialized and deserialized bcoz of transient keyword
    public int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}