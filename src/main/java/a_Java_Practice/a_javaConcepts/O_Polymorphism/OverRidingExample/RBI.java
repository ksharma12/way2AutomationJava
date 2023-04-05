package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample;

public class RBI {

    // Overloading implementation by making the signatures of methods different
    public void getHomeLoanROI(String bankName){
    }
    public void getHomeLoanROI(String bankName, int amount){
    }
    public void getHomeLoanROI(int amount){
    }
    public void getHomeLoanROI(int amount, String bankName){
    }
    public void getHomeLoanROI(String amount, String bankName){
    }
    public void getHomeLoanROI(int amount, int bankName){
    }
    public double getHomeLoanROI(){

        return 8.5;
    }
    public double getCarLoanROI(){

        return 10.5;
    }
    public Number showInteger(){

        return 10;
    }
    public RBI getObject(){
        RBI obj = new RBI();
        return obj;
    }
    public static void main(String[] args) {
        RBI obj = new RBI();
    }
}
