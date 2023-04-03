package a_Java_Practice.a_javaConcepts;

public class D_Methods {
    // instance variables
    int i = 0;
    String s = "this is instance variable";
    float f = 23424f;

    /*
    access modifiers   :- default, public, private, protected
    instance variables :- declared with in class body --- can be accessed throughout the class
    local variables    :- declared inside method body
    class variables    :-
     */

    public void display(int a, int b){

    }
    public int display(int a, int b, int c){
      return 10;
    }

    public String display(String a, String b, String c){
        return "My name is Keshav Sharma";
    }

    public int display(String s, int i, char c, float f, boolean b){
        // local variables
        s = "This is an example of string";
        i = 23131;
        c = 'C';
        f = 242.424f;
        b = false;
        return i;
    }
    public static void main(String[] args) {
        D_Methods obj_methods = new D_Methods();
        System.out.println(obj_methods.display("asdsad",234,'c',242f,true));

        //what will be the result of this :-
        D_Methods obj1 = new D_Methods();
        obj1.i++;
        D_Methods obj2 = new D_Methods();
        obj2.i++;
        D_Methods obj3 = new D_Methods();
        System.out.println(obj3.i);  // result printed 0, as the multiple copies(instances) of objects created and each of them having its own instance variables

        //  pre-defined APIs and there respective methods
        double random_number = Math.random() * 5;
        System.out.println(random_number);
        // Type Casting and Conversion
        System.out.println((int)random_number);

    }
}
