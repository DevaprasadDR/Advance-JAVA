//Description=sum of square of each digit
//Author : Kaviya
package Programs;

import java.util.Scanner;

public class Squarethedigit {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.println("Enter the of n");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        while (n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        System.out.println(sum);
    }
}
