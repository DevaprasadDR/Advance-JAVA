package Collections.Jyothi;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {


        List<String> ll = new LinkedList<String>();
        ll.add("Jyothi");
        ll.add("Kaviya");
        ll.add("Sathiya");
        ll.add("Kaviya");
        for (String name : ll)

            System.out.println(name);
        Set<String> sm = new HashSet<>();
        sm.addAll(ll);
        System.out.println("Sorted list name:");
        for (String name : sm)
            System.out.println(name);
    }
}



