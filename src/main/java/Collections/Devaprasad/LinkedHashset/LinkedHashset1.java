package Collections.Devaprasad.LinkedHashset;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedHashset1 {
    public static void main(String [] args) {
        LinkedList<String> ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("add element:");
            String element = sc.next();
            ll.add(element);
        }
            System.out.println("Initial list of elements: "+ll);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("remove element:");
            ll.remove(sc1.next());
            System.out.println("After remove(object) method: " + ll);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("remove element based on index:");
        ll.remove(sc2.nextInt());
            System.out.println("After remove(index) method: " + ll);
            LinkedList<String> ll2 = new LinkedList<String>();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int a = sc3.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("add element:");
            String element = sc3.next();
            ll2.add(element);
        }
            ll.addAll(ll2);
            System.out.println("Updated list : " + ll);
        }

    }