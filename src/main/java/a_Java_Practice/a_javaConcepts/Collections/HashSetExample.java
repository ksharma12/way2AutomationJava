package a_Java_Practice.a_javaConcepts.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // unordered list and only allow unique values not include duplicate values
        HashSet<String> set = new HashSet<>();
        set.add("Keshav");
        set.add("Way2Automation");
        set.add("Selenium");
        set.add("Appium");
        set.add("Keshav");
        set.add("Appium");
        System.out.println("------------------------------------Set items----------------------------------------------------------");
        System.out.println(set);

        System.out.println("-----------------------------------different set items--------------------------------------------------------------------");
        HashSet set1 = new HashSet<>();
        set1.add(234234);
        set1.add("effqqwfqfqwf");
        for (Object var : set1) {
            System.out.println(var);
        }

        // There are no indexes in set therefore we use non-indexing technique to get all items
        System.out.println("-----------------------------------With ForEach loop--------------------------------------------------");
        for (String var : set) {
            System.out.println(var);
        }

        // With iterator looping
        System.out.println("-----------------------------------With iterator looping--------------------------------------------------");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj.equals("Appium")) {
                System.out.println(obj);
            }
        }
    }
}
