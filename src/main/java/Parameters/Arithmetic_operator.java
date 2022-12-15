package Parameters;

import java.util.Scanner;

public class Arithmetic_operator {
    static void operation(int a,int b,int n){

        switch (n) {
            case 1 -> {
                int add;
                add = a + b;
                System.out.println("Addition of numbers is: " + add);
            }
            case 2 -> {
                int sub;
                sub = a - b;
                System.out.println("Subtraction of numbers is : " + sub);
            }
            case 3 -> {
                int mul;
                mul = a * b;
                System.out.println("Multiplication of numbers is : " + mul);
            }
            case 4 -> {
                float div;
                div = (float) a / b;
                System.out.print("Division of numbers is : " + div);
            }
            default -> System.out.println("we cannot perform other operations");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers to perform operations ");
        System.out.print("Enter the first number : ");
        int x = s.nextInt();
        System.out.print("Enter the second number : ");
        int y = s.nextInt();

        System.out.println("Choose the operation you want to perform ");
        System.out.println("Choose 1 for ADDITION");
        System.out.println("Choose 2 for SUBTRACTION");
        System.out.println("Choose 3 for MULTIPLICATION");
        System.out.println("Choose 4 for DIVISION");
        int m = s.nextInt();
        operation(x,y,m);

    }
}
