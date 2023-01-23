package Collections.Kaviya;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMap_To_SortedMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(643253, "TamilNadu");
        map.put(695615, "Kerala");
        map.put(673310, "Pondicherry");
        map.put(591346, "Karnataka");
        map.put(110097, "Delhi");
        map.put(403806, "Goa");
        map.put(160104, "Punjab");
        System.out.println("State pincode:");
        for (Map.Entry me : map.entrySet()) {
            System.out.println("Pincode: " + me.getKey() + "   State: " + me.getValue());
        }
        //System.out.println("HashMap: "+map);
        SortedMap<Integer, String> sm = new TreeMap<>();
        sm.putAll(map);
        System.out.println("Sorted State pincode:");
        for (Map.Entry me : sm.entrySet()) {
            System.out.println("Pincode: " + me.getKey() + "   State: " + me.getValue());
        }
    }
}
