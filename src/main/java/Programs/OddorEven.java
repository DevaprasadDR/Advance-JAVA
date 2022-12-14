/*Author : Kaviya V
Description: To find Odd or Even
 */

package Programs;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = sc.nextInt();
        if(number%2==0)
        {
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
