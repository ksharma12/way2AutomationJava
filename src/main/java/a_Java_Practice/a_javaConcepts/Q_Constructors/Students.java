package a_Java_Practice.a_javaConcepts.Q_Constructors;

import java.sql.SQLOutput;

public class Students {
    String StudentName;
    int RollNo;
    public Students(String StudentName, int RollNo){
        this(23);  // constructor chaining
        System.out.println("Calling Constructor Students from Students class");
        this.StudentName = StudentName;
        this.RollNo = RollNo;
    }

    public Students(int RollNo){
        this(); // constructor chaining
        System.out.println(RollNo);
    }
    public Students(){
        System.out.println("just calling overloaded no args constructor");
    }
    public static void main(String[] args) {
        Students obj = new Students("Keshav Sharma",101);
        Students obj1 = new Students();
        System.out.println(obj.RollNo);
        System.out.println(obj.StudentName);
    }
}
