package Sample_Programs;

public class AreaOfCircle {
    static void area()
    {
        int r=5;
        final double pi=3.142;
        double result=pi*r*r;
        System.out.println(result);
        return;
    }
    public static void main(String[] args){
        System.out.println("**main starts**");
        area();
        System.out.println("**main ends**");
    }
}
