package Collections.Devaprasad.HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("add element:");
            String element = sc.next();
            hs.add(element);
        }
        System.out.println("Initial list of elements: " + hs);

    }
}
