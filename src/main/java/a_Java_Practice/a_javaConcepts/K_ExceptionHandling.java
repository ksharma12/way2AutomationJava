package a_Java_Practice.a_javaConcepts;

public class K_ExceptionHandling {
    /*
    1. Checked exceptions
    2. Runtime exceptions
    3. Errors
    */
    public static void main(String[] args) throws Exception {
        System.out.println("Beginning");
        try{
            int divide = 10/5;
            System.out.println(divide);
        }catch(Exception e){
            System.out.println("error occurred");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Ending");

        System.out.println("---------------------try-----catch--------------------------------------------------------------");

        Thread.sleep(1000);
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Something went wrong with sleep");
        }

        System.out.println("---------------------try-----catch--------------------------------------------------------------");

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Something went wrong with sleep");
        }

        System.out.println("--------------------try----catch-----finally-----------------------------------------------------------");

        try {
            int divide = 10/0;
            System.out.println("DB connection established");
            System.out.println("Executing Some Queries");
            System.out.println("Validating data and comparing from websites");
        }catch (Exception e){
            System.out.println("Something went wrong with sleep");
        }finally {
            System.out.println("DB connection closed");
        }
    }
}
