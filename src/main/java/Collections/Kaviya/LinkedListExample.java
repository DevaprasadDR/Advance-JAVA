package Collections.Kaviya;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Car");
        ll.add("Bus");
        ll.add("Bike");
        Iterator i= ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

