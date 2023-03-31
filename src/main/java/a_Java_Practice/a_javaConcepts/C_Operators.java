package a_Java_Practice.a_javaConcepts;

public class C_Operators {

    /*
       12  + 34 here (+) is operator and 12 and 34 are operands
       Unary operators  ----> 1 operand
       Binary operators ----> 2 operands
       Ternary operator ----> 3 operands
    */
    public static void main(String[] args) {
        System.out.println(!true);

        /* (Binary Operators) Arithmetic operators -
         + addition and concatenation,
         - subtraction,
         * multiplication,
         / division,
         % remainder
         */
        System.out.println("My" + "Name" + "Is" + "Keshav" + "Sharma");  // concatenation operator
        System.out.println(12 + 23 + 34); // addition operator
        System.out.println(234 - 123); // subtraction operator
        System.out.println(23 * 13); // multiplication operator
        System.out.println(23 / 13); // division operator
        System.out.println(23 % 13); // remainder operator
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        /*
         Equality and Relational operators -
         ==, !=, >, <, >=, <=
         Conditional operators
         &&, ||, ?: - ternary operator
        */
        int num1 = 3242;
        int num2 = 43423;
        System.out.println(num1 == num2);
        System.out.println(num1 < num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println((123 > 23) && (123 < 23));
        System.out.println((123 > 23) || (123 < 23));
    }
}
