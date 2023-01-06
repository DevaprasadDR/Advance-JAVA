package Collections.Jyothi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToLinkedlist {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        List<Integer> KeyList = new ArrayList(map.keySet());
        List<Integer> valuelist = new ArrayList(map.values());
        System.out.println("key List: " + KeyList);
        System.out.println("value List: " + valuelist);


    }
}
