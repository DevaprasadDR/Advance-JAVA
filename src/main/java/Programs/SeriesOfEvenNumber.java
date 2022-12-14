/*Author : Kaviya V
Description: To print the Even numbers in series
 */
package Programs;

import java.util.Scanner;

public class SeriesOfEvenNumber {
    public static void main(String[] args) {
        int number1,number2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number");
        number1=sc.nextInt();
        System.out.println("Enter the last number");
        number2=sc.nextInt();
        for(int i=number1;i<=number2;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
