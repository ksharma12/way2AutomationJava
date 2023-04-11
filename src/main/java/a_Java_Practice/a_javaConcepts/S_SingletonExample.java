package a_Java_Practice.a_javaConcepts;

public class S_SingletonExample {
    private static S_SingletonExample instance = new S_SingletonExample();
    private S_SingletonExample(){
        System.out.println("constructor of S_SingletonExample class");
    }
    public static S_SingletonExample getInstance(){
       return instance;
    }
}
