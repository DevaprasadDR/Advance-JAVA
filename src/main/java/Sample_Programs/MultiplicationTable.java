/*Author = Deva Prasad
Description:  Print Multiplication Table
 */
package Sample_Programs;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=s.nextInt();
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter value");
        int y=s1.nextInt();
        for(int i=1; i <= y; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
