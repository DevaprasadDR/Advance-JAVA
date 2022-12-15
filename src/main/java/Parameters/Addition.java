/*Author= Deva Prasad
Description= To Add the Numbers with parameters
 */
package Parameters;

import java.util.Scanner;

public class Addition {
    static void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition of numbers is : "+c);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers to perform operations ");
        System.out.print("Enter the first number : ");
        int x = s.nextInt();
        System.out.print("Enter the second number : ");
        int y = s.nextInt();
        add(x,y);
    }
}
