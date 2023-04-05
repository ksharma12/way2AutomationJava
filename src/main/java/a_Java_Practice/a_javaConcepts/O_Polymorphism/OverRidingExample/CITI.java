package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample;

public class CITI extends RBI{
    public double getHomeLoanROI(){
        return 10.5;
    }
    public Integer showInteger(){

        return 10;
    }
    public static void main(String[] args) {
        CITI obj = new CITI();
        RBI obj1 = new CITI();
        System.out.println(obj1.getCarLoanROI());
        System.out.println(obj.getHomeLoanROI()); // this would return the amount which is reset by function overrides in current class
    }
}
