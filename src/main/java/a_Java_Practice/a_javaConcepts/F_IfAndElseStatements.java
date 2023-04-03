package a_Java_Practice.a_javaConcepts;

import java.sql.SQLOutput;

public class F_IfAndElseStatements {
    public static void main(String[] args) {
        double random_number = Math.random() * 20;
        int random_number_integer = (int)random_number;
        System.out.println(random_number_integer);
        if (random_number_integer > 10){
            System.out.println(random_number_integer+" Number is greater than 10");
        }
        if (random_number_integer < 10)
            System.out.println(random_number_integer+" Number is smaller than 10");
        else if(random_number_integer < 15 && random_number_integer > 10)
            System.out.println(random_number_integer+" Number is smaller than 10");
        else
            System.out.println(random_number_integer+" Number is greater than 15");
    }
}
