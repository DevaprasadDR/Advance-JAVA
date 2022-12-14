/*Author = Deva Prasad
Description: count binary digit in given number
 */
package Programs;

import java.util.Scanner;

public class Binarydigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        //int number= 1100112810;
        int count=0;
        while (number!=0)
        {
            int rem=number%10;
            if (rem==1 || rem==0)
            {
                count++;
            }
            number=number/10;
        }
        System.out.println(count);
    }
}
