package Collections.Sathiyapriya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        System.out.println(list);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Which index should be removed");
        list.remove(sc1.nextInt());
        System.out.println(list);
    }

}

