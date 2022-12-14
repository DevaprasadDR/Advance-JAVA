/*Author : Kaviya V
Description: To print reverse string
 */
package Sample_Programs;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        int len = str.length();
        for (int i = len; i > 0; i--) {
            System.out.print(str.charAt(i - 1));
        }
    }
}
