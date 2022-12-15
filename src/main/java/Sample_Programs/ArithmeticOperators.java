/*Author = Deva Prasad
Description: Perform addition, subtraction,multiplication,division
 */
package Sample_Programs;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int Num1= sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Num2");
        int Num2= sc1.nextInt();

        System.out.println("Num1 + Num2 = " + (Num1 + Num2));//addition

        System.out.println("Num1 - Num2 = " + (Num1 - Num2));//subtraction

        System.out.println("Num1 * Num2 = " + (Num1 * Num2));// multiplication

        System.out.println("Num1 / Num2 = " +(float) Num1 / Num2);// division
    }
}
