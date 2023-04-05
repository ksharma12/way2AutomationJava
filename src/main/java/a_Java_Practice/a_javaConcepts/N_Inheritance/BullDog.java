package a_Java_Practice.a_javaConcepts.N_Inheritance;

public class BullDog extends Dog{
    public static void main(String[] args) {
        BullDog obj = new BullDog();
        Dog obj1 = new BullDog();     // parent class
        Animal obj2 = new BullDog();
        obj.sound();
    }
}
