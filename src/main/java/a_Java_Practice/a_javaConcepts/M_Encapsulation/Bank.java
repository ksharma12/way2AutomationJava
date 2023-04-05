package a_Java_Practice.a_javaConcepts.M_Encapsulation;

public class Bank {
    // Drawbacks of not applying encapsulation:-
    private int accountNo = 123456;
    private int pinNo = 1234;
    private double balanceAmount = 90000;
    public int getPinNo() {
        return pinNo;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }
    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    public double getBalanceAmount() {
        return balanceAmount;
    }
    public void withdrawAmount(int accNo, int pin, int amount){
        if (accNo == getAccountNo() && pin == getPinNo()){
            if (amount <= getBalanceAmount()){
                double balanceAmount = getBalanceAmount() - amount;
                setBalanceAmount(balanceAmount);
                System.out.println("balance amount after withdraw "+getBalanceAmount());
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Invalid credentials !!!");
        }
    }
    public void updatePin(int accNo, int oldPin, int newPin){
        if (accNo == getAccountNo() && getPinNo() == oldPin){
            setPinNo(newPin);
            System.out.println("Pin Changed Successfully !!!");
        } else{
            System.out.println("Invalid Credentials !!!");
        }
    }
    public double depositCash(int accNo, int pin, double amount){
        if (accNo==getAccountNo() && pin==getPinNo()){
            double balanceAmount = getBalanceAmount() + amount;
            setBalanceAmount(balanceAmount);
            System.out.println("Total balance amount after deposit "+getBalanceAmount());
            return amount;
        }else {
            System.out.println("Invalid Credentials !!!");
            return getBalanceAmount();
        }
    }
}
