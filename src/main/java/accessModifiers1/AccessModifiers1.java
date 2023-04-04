package accessModifiers1;

public class AccessModifiers1 {

    public String aM1Public = "AccessModifiers1 class public variable";
    String aM1Default = "AccessModifiers1 class default variable";
    private String aM1Private = "AccessModifiers1 class private variable";
    protected String aM1Protected = "AccessModifiers1 class protected variable";

    void displayDefault(){
        System.out.println("Method is default type and from AccessModifiers1 class");
    }
    public void displayPublic(){
        System.out.println("Method is Public type and from AccessModifiers1 class");
    }
    protected void displayProtected(){
        System.out.println("Method is Protected type and from AccessModifiers1 class");
    }
    private void displayPrivate(){
        System.out.println("Method is Private type and from AccessModifiers1 class");
    }
}
