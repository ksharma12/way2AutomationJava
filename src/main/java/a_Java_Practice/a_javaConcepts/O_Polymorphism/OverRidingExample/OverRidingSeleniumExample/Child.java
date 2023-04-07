package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample.OverRidingSeleniumExample;

public class Child extends Parent{

    public void c1(){
        System.out.println("child class c1");
    }
    public static void c2(){
        System.out.println("c2 method from child class");
    }
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
        obj.display();
        obj.add();  // not allowed will call the method from parent class , ideally it must call the method from child class

    }
}
