package Collections.Kaviya;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int num=in.nextInt();
        Scanner sc1=new Scanner(System.in);


        for (int i = 0; i < num; i++) {
            System.out.println("add elements");
            Integer a = sc1.nextInt();
            String b = sc1.next();

            hmap.put(a,b);
        }

        for (Map.Entry<Integer, String> m : hmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}




