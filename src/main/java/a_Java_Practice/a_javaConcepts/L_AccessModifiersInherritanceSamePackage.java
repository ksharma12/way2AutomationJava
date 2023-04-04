package a_Java_Practice.a_javaConcepts;

public class L_AccessModifiersInherritanceSamePackage extends L_AccessModifiers{
    public static void main(String[] args) {
        L_AccessModifiersInherritanceSamePackage obj = new L_AccessModifiersInherritanceSamePackage();
        System.out.println(obj.aMDefault);
        System.out.println(obj.aMProtected);
        System.out.println(obj.aMPublic);
        obj.displayDefault();
        obj.displayProtected();
        obj.displayPublic();
    }
}
