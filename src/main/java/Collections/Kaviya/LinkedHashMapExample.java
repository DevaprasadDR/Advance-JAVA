package Collections.Kaviya;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> link=new LinkedHashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nuber of values:");
        int num=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        /*link.put("Tamil",90);
        link.put("English",85);
        link.put("Maths",99);
        link.put("Science",100);
        link.put("SocialScience",93);
        System.out.println("Student marklist:");*/
        for(int i=0;i<num;i++){
            System.out.println("add elements");
            String a= sc1.next();
            Integer b= sc1.nextInt();
            link.put(a,b);
        }

        for(Map.Entry map: link.entrySet())
        {
            System.out.println("subject :"+ map.getKey()+"   marks :"+ map.getValue());
        }
    }
}
