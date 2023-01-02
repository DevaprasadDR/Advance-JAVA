package Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Mango");
        al.add("Orange");
        al.add("Banana");
        System.out.println("Original insertion array list order: " +al);
        al.add(2, "Grapes");
        al.add("JackFruit");
        al.remove("Banana");
        System.out.println("After adding and removing element, ArrayList insertion order ");

        for(String value:al){
            System.out.println(value);
        }

    }
}







