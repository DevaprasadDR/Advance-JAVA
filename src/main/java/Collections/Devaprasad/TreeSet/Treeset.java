package Collections.Devaprasad.TreeSet;


import Collections.Devaprasad.LinkedHashset.Employee;

import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("add element:");
            Integer Values = sc.nextInt();
            ts.add(Values);
        }
        System.out.println("Initial list of Values: " + ts);


    }
}
