package a_Java_Practice.a_javaConcepts;

import accessModifiers1.AccessModifiers1;

public class L_AccessModifiersInheritanceAnotherPackage extends AccessModifiers1 {

    public static void main(String[] args) {

        L_AccessModifiersInheritanceAnotherPackage obj = new L_AccessModifiersInheritanceAnotherPackage();
        System.out.println(obj.aM1Public);
        obj.displayPublic();
        System.out.println(obj.aM1Protected);
        obj.displayProtected();
    }
}
