class Person {
    String name;
    int age;
    String dob;

    void printDob() {
        System.out.println(dob);
    }
}

class Job extends Person {
    int salary;
    String officName;
    String officeLocation;

    void details() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age : " + age);
        System.out.println("Employee DOB : " + dob);
        System.out.println("EMployee Office Name : " + officName);
        System.out.println("Employee Offic Location : " + officeLocation);
        System.out.println("Employee Salary : " + salary);
    }
}

class basic {
    public static void main(String args[]) {
        Job j = new Job();
        j.name = "Kabilan K";
        j.age = 18;
        j.dob = "29/07/2004";
        j.officName = "Tcs";
        j.officeLocation = "Chennai";
        j.salary = 50000;
        j.details();
    }
}