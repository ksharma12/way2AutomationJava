package a_Java_Practice.a_javaConcepts.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list);  // printing empty list
        System.out.println(list.size());  // printing size of empty list
        System.out.println("---------------How to add the values to a list----------------------------------");

        // How to add the values to a list
        list.add(10);
        list.add("Name is Keshav Sharma");
        list.add(423424.323412f);
        list.add(234322421421352232L);
        list.add('d');
        list.add(true);
        list.add(null);
        list.add('d');
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("--------------------------How to fetch the values from the list---------------------------");

        // How to fetch the values from the list
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println("-----------------------Remove any value from list------------------------------------");

        // Remove any value from list
        list.remove(5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("------------------------With Normal For loop--------------------------------------");

        // Getting All the values from List
        // With Normal For loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------With ForEach loop---------------------------------------");

        // With ForEach loop
        for (Object var:list) {
            System.out.println(var);
        }
        System.out.println("-------------------------With Iterator(interface)----------------------------------");

        // With Iterator(interface)
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-------------------------Type Specific ArrayList----------------------------------");
        Integer var = (Integer)list.get(0);
        System.out.println(var+20);
        System.out.println("-------------------------Generic ArrayList----------------------------------");

        List<Integer> listGeneric = new ArrayList<Integer>();
        listGeneric.add(234);
        listGeneric.add(null);
        int i = listGeneric.get(0);
        System.out.println(i + 234);
    }
}
