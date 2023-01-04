package Collections.Kaviya;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer,String>sm=new TreeMap<Integer,String>();
        sm.put(18,"Kaviya");
        sm.put(10,"Shalini");
        sm.put(25,"Sowndharya");
        sm.put(30,"Revathi");
        sm.put(15,"Lavanya");
        sm.put(32,"Bharathi");
        System.out.println("Enter the student Rollnumber and Name:" +sm);
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println("headMap: "+sm.headMap(25));
        System.out.println("tailMap: "+sm.tailMap(25));
        System.out.println("subMap: "+sm.subMap(10,32));

    }
}
