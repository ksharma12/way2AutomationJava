package a_Java_Practice.a_javaConcepts.Collections;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class AutoBoxing {
    public static void main(String[] args) {
        int value = 10;
        Integer obj = new Integer(value);  // Wrapping/AutoBoxing
        int i = obj; // UnWrapping/AutoUnBoxing
        System.out.println(obj);
    }

}
