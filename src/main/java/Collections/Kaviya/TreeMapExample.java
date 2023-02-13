package Collections.Kaviya;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
       /* map.put(2605914,"Cuddalore");
        map.put(2159775	,"Dindigul");
        map.put(2251744,"Erode");
        map.put(3458045,"Coimbatore");
        map.put(3482056,"Salem");
        System.out.println("District population:");*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int num=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<num;i++){
            System.out.println("pincode and state");

            Integer a= sc1.nextInt();
            String b= sc1.next();
            map.put(a,b);
        }

        for(Map.Entry entry:map.entrySet()){
            System.out.println("population :"+ entry.getKey()+"  district :"+entry.getValue());
        }

    }
}
