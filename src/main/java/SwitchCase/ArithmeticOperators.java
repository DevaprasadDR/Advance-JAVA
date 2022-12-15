/*author:sathiyaPriya
description:To print arithmetic operators we used switch statements to perform that particular operations.
 */
package SwitchCase;


import java.util.Scanner;
    public class ArithmeticOperators
    {
        public static void main(String args[])
        {
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
                int n = s.nextInt();
                switch(n)
                {
                    case 1:
                        int add;
                        add = x + y;
                        System.out.println("Result : "+add);
                        break;
                    case 2:
                        int sub;
                        sub = x - y;
                        System.out.println("Result : "+sub);
                        break;
                    case 3:
                        int mul;
                        mul = x * y;
                        System.out.println("Result : "+mul);
                        break;
                    case 4:
                        float div;
                        div = (float) x / y;
                        System.out.print("Result : "+div);
                        break;
                    default:
                        System.out.println("we cannot perform other operations");
                }
            }
        }




