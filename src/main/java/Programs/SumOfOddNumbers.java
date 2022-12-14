/*Author : Kaviya V
Description: To print the sum of odd number
 */
package Programs;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int number1,number2,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number");
        number1=sc.nextInt();
        System.out.println("Enter the last number");
        number2=sc.nextInt();
        for(int i=number1;i<=number2;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.print("Sum of Odd number is : "+sum);
    }
}
