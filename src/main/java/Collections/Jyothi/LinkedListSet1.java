package Collections.Jyothi;

import java.util.LinkedList;

public class LinkedListSet1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // Use add() method to add elements in the list
        list.add("Greek");
        list.add("for");
        list.add("Greeks");
        list.add("java");
        list.add("for");
        //Displaying the linked list

        System.out.println("LinkedList:" + list);
        //Using set() method to replace Greeks with GFG
        System.out.println("The object that is replaced is: " + list.set(2,"Greeks"));
        //Using set() method to replace 20 with 50
        System.out.println("The object that is replaced is: " + list.set(4,"50"));
        //Displaying the modified linkedlist
        System.out.println("The new  LinkedList is:" + list);



    }

}

