package Collections.Devaprasad.LinkedHashset;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Employee> lhs = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("add element:");
            String a = sc1.next();
            Integer b = sc1.nextInt();
            Integer c = sc1.nextInt();

            Employee emp = new Employee(a, b, c);
            lhs.add(emp);
            System.out.println("linkedHashSet : " + lhs + "\n");

            for (Employee employee : lhs) {
                System.out.println("-------------------------------------");
                System.out.println(employee.toString());
                System.out.println("Name : " + employee.getName());
                System.out.println("Age : " + employee.getAge());
                System.out.println("Salary : " + employee.getSalary());
            }

        }
    }
}
