package a_Java_Practice.a_javaConcepts;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class J_Arrays {
    // collection of similar datatypes
    static int[] array = new int[10];  // array of size 10 of type integers
    static String[] myArray = new String[13]; // array of size 13 of type string
    static int[] array1 = {1,2,3,34,5,47,345,35,22};  // array values hard coded
    public static void main(String[] args) {
        System.out.println(myArray);
        array[0] = 3;
        array[2] = 5;
        array[5] = 7;
        System.out.println(myArray.length);  // this is a property , length is final variable which makes this array length fixed in size
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = "this";
            System.out.println(myArray[index]);
        }
        System.out.println("-------------------------------------------------------------------------");
        for (int index = 0; index < array.length; index++) {
            array[index] = (int)(Math.random() * 1000);
            System.out.println(array[index]);
        }
        System.out.println("-------------------------------------------------------------------------");
        // for each loop
        for (int var: array) {
            System.out.println(var);
        }
        System.out.println("-------------------------------------------------------------------------");
        // for loop reverse order
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }

    //-----------------------------------------------------------------2D arrays---------------------------------------------------------------------------------
        System.out.println("---------------------------------------------2D arrays----------------------------");
        int [][] TwoDArray = new int[2][3];
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int j = 0; j < TwoDArray[i].length; j++) {
                TwoDArray[i][j] = (int)(Math.random() * 1000);
                System.out.print(TwoDArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("2D array length is "+TwoDArray.length);
        System.out.println("2D array index 0 length is "+TwoDArray[0].length);

    //-----------------------------------------------------------------3D arrays---------------------------------------------------------------------------------
        System.out.println("---------------------------------------------3D arrays----------------------------");
        int [][][] ThreeDArray = new int[2][3][4];  // total 24 items
        for (int i = 0; i < ThreeDArray.length; i++) {
            for (int j = 0; j < ThreeDArray[i].length; j++) {
                for (int k = 0; k < ThreeDArray[i][j].length; k++) {
                    ThreeDArray[i][j][k] = (int)(Math.random() * 1000);
                    System.out.println("ThreeDArray["+i+"]["+j+"]["+k+"] "+ThreeDArray[i][j][k] + " ");
                }
            }
        }
    }
}
