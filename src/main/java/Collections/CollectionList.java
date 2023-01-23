package Collections;

import java.util.LinkedList;

public class CollectionList {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

            ll.add("Geeks");
            ll.add("Geeks");
            ll.add(1, "Geeks");

            System.out.println("Initial LinkedList " + ll);

            ll.set(1, "For");

            System.out.println("Updated LinkedList " + ll);
        }
    }

