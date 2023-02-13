package Collections.Kaviya;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new <Integer, String>HashMap();
        hashMap.put(100, "Apple");
        hashMap.put(55, "Grapes");
        hashMap.put(60, "Pineapple");
        hashMap.put(50, "Banana");
        hashMap.put(40, "Orange");
        System.out.println("Enter the price of the fruits:" + hashMap);
        System.out.println(hashMap.get(50));
        hashMap.remove(55);
        System.out.println("Fruits and price:" + hashMap);
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());

        for (Integer me : hashMap.keySet()) {
            System.out.println(me);
        }
        for (String me : hashMap.values()) {
            System.out.println(me);
        }
        for (Map.Entry me : hashMap.entrySet()) {
            System.out.println("Price: " + me.getKey() + "   Fruit: " + me.getValue());

        }
    }
}

