public class toString {
    public static void main(String[] args) {
        Person p=new Person("Kabilan","TCS","19","50000");
        System.out.println(p);
    }
}

class Person{
    String name,company,age,exp;
    Person(String n,String c,String a,String e){
        name=n;
        company=c;
        age=a;
        exp=e;
    }
    public String toString(){
        return String.format("Name : %s\nCompany : %s\nAge : %s\nExperience : %s",name,company,age,exp);
    }
}