//sum of cube of each digit

package Programs;

public class amstrong {
    public static void main(String[] args) {
        int n=1873;
        int sum=0;
        int copy=n;
        while (n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if (sum==copy)
        {
            System.out.println("Amstrong no");
        }
        else
        {
            System.out.println("not an Amstrong no");
        }
    }
}
