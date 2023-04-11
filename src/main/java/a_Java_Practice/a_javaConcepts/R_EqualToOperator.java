package a_Java_Practice.a_javaConcepts;

public class R_EqualToOperator {
    public static void main(String[] args) {
        String a = "Way2Automation";
        String b = "Way2Automation";

        String name_1 = new String("Keshav");
        String name_2 = new String("Keshav");


        int x = 100;
        int y = 100;

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(x==y);
        System.out.println(name_1.equals(name_2)); // content is same
        System.out.println(name_1==name_2);  // address is different

        // Singleton class instances created only once and both the instances are pointing out to single object only which created once
        S_SingletonExample instance_1 = S_SingletonExample.getInstance();
        S_SingletonExample instance_2 = S_SingletonExample.getInstance();
        System.out.println(instance_2==instance_1);
        System.out.println(instance_1);
        System.out.println(instance_2);

    }
}
