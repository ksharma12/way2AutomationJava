package accessModifiers1;

public class AccessModifier1_1 {
    public static void main(String[] args) {
        AccessModifiers1 am1 = new AccessModifiers1();
        System.out.println(am1.aM1Default);
        System.out.println(am1.aM1Public);
        System.out.println(am1.aM1Protected);
        am1.displayDefault();
        am1.displayPublic();
        am1.displayProtected();
    }
}
