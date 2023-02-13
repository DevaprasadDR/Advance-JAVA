package Collections.Devaprasad.HashSet;

import java.util.HashSet;
import java.util.Set;

public class BasicHashset {
    public static void main(String[] args) {
        Set<Integer> ht=new HashSet<>();
        System.out.println(ht.add(6));
        System.out.println(ht.add(8));
        System.out.println(ht.add(6));
        System.out.println(ht.add(10));
        System.out.println(ht.add(13));
        System.out.println(ht.add(10));
       Set<Integer> i=ht;
            System.out.println(i);
    }
}
