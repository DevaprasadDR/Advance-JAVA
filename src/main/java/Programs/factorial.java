//description= find the factorial
//Author= Deva Prasad
package Programs;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1,n;
        System.out.println("Enter the of n");
                Scanner sc=new Scanner(System.in);
                n= sc.nextInt();
        for (int i=n;i>=1; i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
