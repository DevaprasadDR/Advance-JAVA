//description= sum of cube of each digit
//Author= Deva Prasad

package Sample_Programs;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        int n = 0,sum=0;
        int copy=n;
        System.out.println("Enter the of n");
        Scanner sc=new Scanner(System.in);
         n= sc.nextInt();
        
        while (n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if (sum==copy)
        {
            System.out.println("Amstrong no");
        }
        else
        {
            System.out.println("not an Amstrong no");
        }
    }
}
