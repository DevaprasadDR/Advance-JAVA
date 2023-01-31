package Collections.Jyothi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int num=in.nextInt();
        Scanner sc1=new Scanner(System.in);


        for (int i = 0; i < num; i++) {
            System.out.println("add elements");
            Integer a = sc1.nextInt();
            String b = sc1.next();

            map.put(a,b);}
        List<Integer> intValues = (List<Integer>) map.keySet().stream().collect(Collectors.toList());
        System.out.println(intValues);
        List<String> strValues = (List<String>) map.values().stream().collect(Collectors.toList());
        System.out.println(strValues);


    }
}
