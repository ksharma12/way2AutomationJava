package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample;

public class HSBC extends RBI{
    public double getHomeLoanROI(){
        return 10.5;
    }
//    public HSBC getObject(){
//        HSBC obj = new HSBC();
//        return obj;
//    }
    public AMEX getObject(){
        AMEX obj = new AMEX();
        return obj;
    }
    public static void main(String[] args) {
        HSBC obj = new HSBC();
        System.out.println(obj.getHomeLoanROI()); // this would return the amount which is reset by function overrides in current class
    }
}
