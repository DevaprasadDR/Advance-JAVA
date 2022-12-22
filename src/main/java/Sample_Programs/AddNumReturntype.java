package Sample_Programs;

public class AddNumReturntype {
    static int add()
    {
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public static void main(String[]args){
        int x=add();
        System.out.println(x);
    }
}
