/*Author:Kaviya V
Description: sum of single array
 */
package Arrays;

import java.util.Scanner;

public class SumOfSingleArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        n=sc.nextInt();
        int sum=0;
        System.out.print("Enter the Array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Sum of array is: ");
        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum+" ");

    }
}

