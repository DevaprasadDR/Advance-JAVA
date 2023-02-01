package Exceptions;

public class ArrayIndexExample {
    public static void main(String[] args) {
        try {
            int a[]=new int[6];
            a[7]=10;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex is Out of Bounds");
        }

    }
}

