package a_Java_Practice.a_javaConcepts;

public class E_StaticNonStatic {

    // static component can never directly give a call to non - static component
    // static component can directly give call to static component
    // non-static component can directly give call to non-static and static component
    public static void main(String[] args) {
        E_StaticNonStatic obj1 = new E_StaticNonStatic();
        obj1.go();
    }

    public void go(){
        System.out.println("Inside go method");
        go1();
        System.out.println("After calling go1 method");
    }
    public void go1(){
        System.out.println("Inside go1 method");
        go2();
        System.out.println("After calling go2 method");
    }
    public void go2(){
        System.out.println("Inside go2 method");
        go3();
        System.out.println("After calling go3 method");
    }

    public static void go3(){
        System.out.println("Inside go3 method");
    }

    /*
Inside go method
Inside go1 method
Inside go2 method
Inside go3 method
After calling go3 method
After calling go2 method
After calling go1 method
     */
}
