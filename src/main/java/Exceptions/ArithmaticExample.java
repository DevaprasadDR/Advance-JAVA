package Exceptions;

public class ArithmaticExample {
    public static void main(String[] args) {
        try {
            int p1score=30, p2score = 0;
            int result=p1score/p2score;
            System.out.println("performance =" +result);
        }
        catch(ArithmeticException e) {
            System.out.println ("Exception caught:Can't divide a score by 0");

        }
    }
}

