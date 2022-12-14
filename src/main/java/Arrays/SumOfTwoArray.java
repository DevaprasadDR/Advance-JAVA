/*Author:Kaviya V
Description: Adding two arrays
 */
package Arrays;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        n=sc.nextInt();
        int[] sum = new int[n];
        System.out.print("Enter the first Array: ");
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the second Array: ");
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.print("Sum of two array is: ");
        for(int i=0; i<n; i++) {
            sum[i] = arr1[i] + arr2[i];
            System.out.print(sum[i]+" ");
        }
    }
}
