/*Author : Kaviya V
Description: To find larger among two number
 */
package Programs;

import java.util.Scanner;

public class LargestAmongTwo {
    public static void main(String[] args) {
        int number1,number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number1: ");
        number1 = sc.nextInt();
        System.out.print("Enter the Number2: ");
        number2 =sc.nextInt();
        if(number1>number2)
        {
            System.out.println(number1+" is larger than "+number2);
        }
        else{
            System.out.println(number1+" is not larger than "+number2);
        }
    }
}
