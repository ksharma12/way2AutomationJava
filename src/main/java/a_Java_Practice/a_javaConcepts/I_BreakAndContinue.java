package a_Java_Practice.a_javaConcepts;

public class I_BreakAndContinue {

    public void go(){
        for (int i = 0; i < 10; i++) {
            if (i ==7)
                break; // used to stop and come out of loop
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------------");
        for (int j = 0; j < 10; j++) {
            if (j ==7)
                continue;  // used to skip the iterations
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        I_BreakAndContinue obj1 = new I_BreakAndContinue();
        obj1.go();
    }
}
