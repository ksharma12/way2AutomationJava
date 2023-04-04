package accessModifiers2;

public class AccessModifiers2 {

    public int aM2Integer1 = 33;
    int aM2Integer2 = 34;
    private int aM2Integer3 = 35;
    protected int aM2Integer4 = 36;

    void displayDefault(){
        System.out.println("Method is default type and from AccessModifiers2 class");
    }
    public void displayPublic(){
        System.out.println("Method is Public type and from AccessModifiers2 class");
    }
    protected void displayProtected(){
        System.out.println("Method is Protected type and from AccessModifiers2 class");
    }
    private void displayPrivate(){
        System.out.println("Method is Private type and from AccessModifiers2 class");
    }
}
