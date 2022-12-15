/*Author= Deva Prasad
Description= Print the Triangle Pattern with parameters
 */
package Parameters;

import java.util.Scanner;

public class Triange_pattern {
    static void triangle(int row)
    {
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        triangle(row);
    }
}
