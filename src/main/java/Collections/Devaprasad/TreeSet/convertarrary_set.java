package Collections.Devaprasad.TreeSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class convertarrary_set {

    public static void main(String[] args) {
        ArrayList<String> has = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("add element:");
            String Values = sc.next();
            has.add(Values);
        }
            System.out.println("arrary elements" +has);
            // ArrayList to LinkedHashSet
            HashSet<String> linkSet = new LinkedHashSet();
            for (String arr : has) {
                linkSet.add(arr);
            }
            System.out.println("Linked HashSet:");
            System.out.println(linkSet);
        }
    }

