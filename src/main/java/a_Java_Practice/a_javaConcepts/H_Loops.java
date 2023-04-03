package a_Java_Practice.a_javaConcepts;

public class H_Loops {
    public static void main(String[] args) {
        // while loop:
        int d = 1;
        while (d <= 10) {
            System.out.println(d);
            d++;
        } // result: 1,2,3,4,5,6,7,8,9,10

        System.out.println("----------------------------------------");
//
//        while (i <= 11); // this semi colen act as break point but infinite loop is running
//            System.out.println(i);  // this semi colen act as break point here
//            i++;
//    }
        int a = 2;
        do{
            System.out.println(a);
            a++;
        }while(a <= 10);

        System.out.println("----------------------------------------");

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        System.out.println("----------------------------------------");

//        for (int j = 0; ; ) {
//            System.out.println(j); // never ending loop and printing 0
//        }
//
//        for (int j = 0; ; j++ ) {
//            System.out.println(j); // never ending loop and printing 0
//        }

//        System.out.println("----------------------------------------");
//        for (; ;) {
//            System.out.println("Inside for loop"); // never ending loop and printing "String"
//        }

        System.out.println("----------------------------------------");
        int b = 3;
        for (;b <=10 ;) {
            System.out.println(b);
            b++;
        }
        System.out.println("-------------------Nested Loops---------------------");

        /*
        while ---> 3 times
        for -----> 4 times
        do-while -----> 5 times
        */ // total times loop is running : 3 * 4 * 5 = 60 times
        int i = 0;
        while(i<3){
            for (int j = 0; j < 4; j++) {
                int k = 0;
                do{
                    System.out.println("i-----> "+i+" j------> "+j+" k------>"+k);
                    k++;
                }while(k< 5);
            }
            i++;
        }

        /*
        output :-
i-----> 0 j------> 0 k------>0
i-----> 0 j------> 0 k------>1
i-----> 0 j------> 0 k------>2
i-----> 0 j------> 0 k------>3
i-----> 0 j------> 0 k------>4
i-----> 0 j------> 1 k------>0
i-----> 0 j------> 1 k------>1
i-----> 0 j------> 1 k------>2
i-----> 0 j------> 1 k------>3
i-----> 0 j------> 1 k------>4
i-----> 0 j------> 2 k------>0
i-----> 0 j------> 2 k------>1
i-----> 0 j------> 2 k------>2
i-----> 0 j------> 2 k------>3
i-----> 0 j------> 2 k------>4
i-----> 0 j------> 3 k------>0
i-----> 0 j------> 3 k------>1
i-----> 0 j------> 3 k------>2
i-----> 0 j------> 3 k------>3
i-----> 0 j------> 3 k------>4
i-----> 1 j------> 0 k------>0
i-----> 1 j------> 0 k------>1
i-----> 1 j------> 0 k------>2
i-----> 1 j------> 0 k------>3
i-----> 1 j------> 0 k------>4
i-----> 1 j------> 1 k------>0
i-----> 1 j------> 1 k------>1
i-----> 1 j------> 1 k------>2
i-----> 1 j------> 1 k------>3
i-----> 1 j------> 1 k------>4
i-----> 1 j------> 2 k------>0
i-----> 1 j------> 2 k------>1
i-----> 1 j------> 2 k------>2
i-----> 1 j------> 2 k------>3
i-----> 1 j------> 2 k------>4
i-----> 1 j------> 3 k------>0
i-----> 1 j------> 3 k------>1
i-----> 1 j------> 3 k------>2
i-----> 1 j------> 3 k------>3
i-----> 1 j------> 3 k------>4
i-----> 2 j------> 0 k------>0
i-----> 2 j------> 0 k------>1
i-----> 2 j------> 0 k------>2
i-----> 2 j------> 0 k------>3
i-----> 2 j------> 0 k------>4
i-----> 2 j------> 1 k------>0
i-----> 2 j------> 1 k------>1
i-----> 2 j------> 1 k------>2
i-----> 2 j------> 1 k------>3
i-----> 2 j------> 1 k------>4
i-----> 2 j------> 2 k------>0
i-----> 2 j------> 2 k------>1
i-----> 2 j------> 2 k------>2
i-----> 2 j------> 2 k------>3
i-----> 2 j------> 2 k------>4
i-----> 2 j------> 3 k------>0
i-----> 2 j------> 3 k------>1
i-----> 2 j------> 3 k------>2
i-----> 2 j------> 3 k------>3
i-----> 2 j------> 3 k------>4
         */
    }
}
