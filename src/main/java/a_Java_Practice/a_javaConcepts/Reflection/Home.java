package a_Java_Practice.a_javaConcepts.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home extends BigHome{
    public static void main(String[] args) {
        ReflectionAPI obj = new ReflectionAPI();

        // Via this we can get any information of this Reflection Class
        System.out.println("------------------------------Via this we can get any information of this Reflection Class-----------------------------------");
        Class clazz = obj.getClass();
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());

        // List of all methods residing in this class
        System.out.println("------------------------------List of all methods residing in this class-----------------------------------");
        Method[] arrayOfMethods = clazz.getDeclaredMethods();  // get method in this class only
        System.out.println(arrayOfMethods.length);
        for (Method method:arrayOfMethods) {
            System.out.println("----------------------------------------------------List of parameters in method "+method.getName()+" -----------------------------------");
            System.out.println("Method Name "+method.getName() + " Return Type "+method.getReturnType());  // getting method name
            Parameter[] params = method.getParameters();
            for (Parameter param:params) {
                System.out.println(param.getName());
            }
        }

        System.out.println("------------------------------List of all methods residing in this class and all others as well-----------------------------------");
        Method[] arrayOfMethods1 = clazz.getMethods();  // get method in this class only
        System.out.println(arrayOfMethods1.length);
        for (Method method:arrayOfMethods1) {
            System.out.println("----------------------------------------------------List of parameters in method "+method.getName()+" -----------------------------------");
            System.out.println("Method Name "+method.getName() + " Return Type "+method.getReturnType());  // getting method name
            Parameter[] params = method.getParameters();
            for (Parameter param:params) {
                System.out.println(param.getName());
            }
        }

        // List of all constructors residing in this class
        System.out.println("------------------------------List of all constructors residing in this class-----------------------------------");
        Constructor[] arrayOfConstructors = clazz.getDeclaredConstructors();
        System.out.println(arrayOfConstructors.length);
        for (Constructor construct:arrayOfConstructors) {
            System.out.println(construct.getName());
        }
    }
}
