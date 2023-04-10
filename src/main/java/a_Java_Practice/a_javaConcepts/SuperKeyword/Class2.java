package a_Java_Practice.a_javaConcepts.SuperKeyword;

public class Class2 extends Class1{
    public Class2(){
        super();
        System.out.println("constructor of class 2");
    }
    public void method2(){
        System.out.println("method of class 1");
        System.out.println(super.variable);
        super.method1();
    }
    public static void main(String[] args) {
        Class2 obj = new Class2();
        obj.method2();
    }

}
