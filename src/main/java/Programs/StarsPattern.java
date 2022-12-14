//description= print the stars pattern
//Author= Deva Prasad
package Programs;

import java.util.Scanner;

public class StarsPattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the of n");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        for (int i=1;i<=n;i++)//row
        {
            for (int j=1;j<=n;j++)//column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
