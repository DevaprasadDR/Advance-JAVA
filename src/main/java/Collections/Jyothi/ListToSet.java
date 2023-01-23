package Collections.Jyothi;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {


        List<String> ll = new LinkedList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int num=in.nextInt();
        Scanner sc1=new Scanner(System.in);


        for (int i = 0; i < num; i++) {
            System.out.println("add elements");
            String b = sc1.next();

            ll.add(b);}

        for (String name : ll)

           System.out.println(name);
        Set<String> sm = new HashSet<>();
        sm.addAll(ll);
        System.out.println("Sorted list name:");
        for (String name : sm)
            System.out.println(name);

    }
}



