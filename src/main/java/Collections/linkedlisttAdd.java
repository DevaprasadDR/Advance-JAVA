package Collections;

import java.util.LinkedList;
import java.util.Scanner;


    public  class linkedlisttAdd {


        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();
            Scanner sc = new Scanner(System.in);
            System.out.println("how many strings do you want to store");

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("add element:");
                String element = sc.next();
                list.add(element);
            }

            System.out.println("linked list elements are");
            for (int i = 0; i < n; i++) {
                System.out.println(list.get(i));
            }
        }
    }






