public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setTip(5);
        // System.out.print(p1.tip);
        System.out.println(p1.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Tripurari";
        // myAcc.setPassword(12345);

        Student s1 = new Student();

        Student s2 = new Student("Tripurari");
        System.out.println(s2.name);

        Student s3 = new Student(123);
        System.out.println(s3.age);

        Student s4 = new Student("Kumar", 16);
        System.out.println(s4.name);
        System.out.println(s4.age);

        Student s5 = new Student(s4);
        System.out.println(s5.name);
        System.out.println(s5.age);
    }
}

class BankAccount{
    public String username;
    private int password;
    public void setPassword(int pwd){
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    // constructor overloading
    Student(){
        System.out.println("Constructor is called....");
    }

    Student(String name){
        this.name = name;
    }

    Student(int age){
        this.age = age;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //copy constructor
    Student (Student s){
        this.name = s.name;
        this.age = s.age;
    }

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy+chem+maths)/3;
    }
}
