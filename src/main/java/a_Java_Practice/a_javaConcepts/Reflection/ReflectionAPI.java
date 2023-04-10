package a_Java_Practice.a_javaConcepts.Reflection;

public class ReflectionAPI {

    public ReflectionAPI(){
        System.out.println("constructor");
    }

    public ReflectionAPI(int a){
        System.out.println("constructor "+a);
    }

    public void display(int a, int b){
        System.out.println("display method");
    }
    public int add(){
        int a = 10;
        System.out.println("add method");
        return 10;
    }
    public float subtract(){
        System.out.println("subtract method");
        return 234.54f;
    }
    public static void main(String[] args) {
        ReflectionAPI obj = new ReflectionAPI();

    }

}
