package a_Java_Practice.a_javaConcepts.Collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("FName","Keshav");
        map.put("LName","Sharma");
        map.put("City","Gurgaon");
        map.put("State","Haryana");
        map.put("Age","32");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("FName"));
        System.out.println(map.get("LName"));  // duplicate values not allowed in map

        System.out.println("------------------------lopping all values and keys---------------------------------------------");
        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println("Key------> "+key+" Value--------> "+map.get(key));
        }

        System.out.println("------------------------Map of List---------------------------------------------");
        Map<String, List<String>> map1 = new HashMap<String,List<String>>();
        List<String> listOfEmails = new ArrayList<String>();
        listOfEmails.add("asdf@asdf.com");
        listOfEmails.add("qwer@qwer.com");
        listOfEmails.add("zxcv@zxcv.com");
        listOfEmails.add("qaz@qaz.com");
        map1.put("Email",listOfEmails);

        List<String> listOfPhoneNumbers = new ArrayList<String>();
        listOfPhoneNumbers.add("8976567875");
        listOfPhoneNumbers.add("9876567853");
        listOfPhoneNumbers.add("8579685425");
        listOfPhoneNumbers.add("9685748541");
        map1.put("PhoneNumbers",listOfPhoneNumbers);
        System.out.println(map1);
        System.out.println(map1.get("Email").get(0));

        System.out.println("------------------------Map of Maps of Lists---------------------------------------------");
        Map<String,Map<String,List<String>>> map2 = new HashMap<String,Map<String,List<String>>>();

    }
}
