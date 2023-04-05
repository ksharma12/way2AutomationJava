package a_Java_Practice.a_javaConcepts.M_Encapsulation;

public class ATM {

    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.updatePin(123456, 1234, 4321);
        obj.withdrawAmount(123456, 4321, 1000);
        obj.depositCash(123456, 4321, 1000);
    }
}
