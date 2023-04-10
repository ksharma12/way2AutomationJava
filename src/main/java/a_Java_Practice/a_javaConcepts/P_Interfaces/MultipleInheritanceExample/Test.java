package a_Java_Practice.a_javaConcepts.P_Interfaces.MultipleInheritanceExample;

public class Test extends ParentClass1 implements Parent1,Parent2{
    @Override
    public void show() {
        System.out.println("Printing show method");
    }
    public static void main(String[] args) {
     Test obj = new Test();
     obj.show();
    }
}
