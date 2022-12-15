/*Author:Kaviya V
Description: To print String array
 */
package Arrays;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the string array: ");
        int n=sc.nextInt();
        String[] value=new String[n];
        System.out.print("Enter the string");
        for(int i=0; i<n; i++)
        {
            value[i]=sc.next();
        }
        for(int i=0;i<n;i++)
         {
             System.out.println("Value stored in "+i+" index is "+value[i]);
         }

    }
}
