package a_Java_Practice.a_javaConcepts;

    /*
    Rules for Creation:
      {class} should be start from capital letter and follow camel casing
      Name should represent [Nouns]
      eg: Way2Automation, Animal, Plant, ByIdOrName etc

      {interfaces} should be start from capital letter and follow camel casing
      Name should represent [Adjectives]
      eg: Runnable, ActionListener, Serializable

      {methods} should be start from small letter and follow camel casing
      Name should represent [Verb-Noun]
      eg: getResult, doCalculation, etc

      {variables} should be start from small letter and follow camel casing
      Name should represent [small-meaning-words]
      eg: buttonWidth, accountBalance, myList

      {constants} should be all upper case and _ used to connect them
      Name should represent [EXIT_ON_CLOSE]
      eg: EXIT_ON_CLOSE, MIN_HEIGHT, etc
     */


public class B_DataTypes_Variables {

    // Primitive Data Types
    int i = 12345;  // ---> Declaration
    float f = 133.5214f;
    double d = 341421421.21421421421424;  // Initialization
    long l = 53232432434324L;
    char c = 'd';
    boolean b = true;
    //class in java as well as type
    String s = "This is java and my name is Keshav Sharma";
    StringBuffer sBuffer;
    StringBuilder sBuilder;
    int batmanBegins = 5353;
    int theDarkKnight = 23535;
    int theDarkKnightRises = 3535;

    // Non-Primitive Data Type
    B_DataTypes_Variables var;

    String s1 = "Way";
    String s2 = "2";
    String s3 = "Automation";

    int num1 = 10;
    int num2 = 15;

    public static void main(String[] args) {
        B_DataTypes_Variables obj = new B_DataTypes_Variables();
        System.out.println(obj.i);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(obj.l);
        System.out.println(obj.c);
        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.sBuffer);
        System.out.println(obj.sBuilder);
        System.out.println(obj.batmanBegins);
        System.out.println(obj.theDarkKnight);
        System.out.println(obj.theDarkKnightRises);

        String abc = new String();
        abc = "Hello";
        String asdf = "Hello";
        String s4 = obj.s1 + obj.s2 + obj.s3;
        System.out.println(obj.s1 + obj.s2 + obj.s3);
        System.out.println("Way" + "2" + "Automation");
        System.out.println(s4);

        System.out.println(obj.num1  + obj.num2);
        // compiler converted the integers num1 and num2 to strings and concatenate them with other strings
        System.out.println("Before" + obj.num1 + obj.num2 + "After");
        // Now compiler follow the BOD MASS rule and first add the numbers and then concatenate them with other strings
        System.out.println("Before" + (obj.num1 + obj.num2) + "After");

    }

}
