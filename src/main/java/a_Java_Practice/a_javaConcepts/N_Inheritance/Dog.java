package a_Java_Practice.a_javaConcepts.N_Inheritance;

public class Dog extends Animal {
    public void sound(){
        System.out.println("Dog Generate Sound");
    }
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}
