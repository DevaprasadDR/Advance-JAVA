//sum of square of each digit
package Programs;

public class Square {
    public static void main(String[] args) {
        int n=127;
        int sum=0;
        while (n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        System.out.println(sum);
    }
}
