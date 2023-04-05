package a_Java_Practice.a_javaConcepts.O_Polymorphism;

public class OverLoadingExample {
    public void add(int a, double b){

    }
    public void add(double a, int b){

    }
    public void add(int a, int b){

    }
    public void add(double a, double b){

    }
    public void add(byte a, byte b){

    }
    public void variableArgumentsBefore(int a, int b, int... c){
        System.out.println(a);
        System.out.println(b);
        for (int var:c) {
            System.out.print(var + " ");
        }
        System.out.println();
    }
    public void variableArgumentsOnly(int... c){
        for (int var:c) {
            System.out.print(var + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
     OverLoadingExample obj = new OverLoadingExample();
     obj.add(2,3);
//     byte a = 2;
//     byte b = 3;
//     obj.add(a,b);
       obj.variableArgumentsBefore(1,2,3,4,5,6,7,8,9,10);
       obj.variableArgumentsOnly(11,12,13,14,15,16,17,18,19,20);
    }
}
