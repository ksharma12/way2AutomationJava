package a_Java_Practice.a_javaConcepts;
import accessModifiers1.AccessModifiers1;

public class L_AccessModifiers {

    public String aMPublic = "AccessModifiers class public variable";
    String aMDefault = "AccessModifiers class default variable";
    private String aMPrivate = "AccessModifiers class private variable";
    protected String aMProtected = "AccessModifiers class protected variable";

    void displayDefault(){
        System.out.println("Method is default type and from AccessModifiers class");
    }
    public void displayPublic(){
        System.out.println("Method is Public type and from AccessModifiers class");
    }
    protected void displayProtected(){
        System.out.println("Method is Protected type and from AccessModifiers class");
    }
    private void displayPrivate(){
        System.out.println("Method is Private type and from AccessModifiers class");
    }
    public static void main(String[] args) {
        AccessModifiers1 am1 = new AccessModifiers1();
        System.out.println(am1.aM1Public);
        am1.displayPublic();
    }
}
