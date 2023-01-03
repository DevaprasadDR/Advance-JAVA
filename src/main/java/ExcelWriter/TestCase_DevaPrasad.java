package ExcelWriter;

import java.util.Scanner;


public class TestCase_DevaPrasad extends ExcelUtilities {
    public static void main(String [] args) throws Exception {

        ExcelUtilities objExcelFile = new ExcelUtilities();
        objExcelFile.createExcel("excel", "hello1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the data to store in a cell: ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("cell number are: ");

        for (int i = 0; i < n; i++) {
            int b = sc2.nextInt();


            // for (int j = 0; j < n; j++) {
            objExcelFile.writeExcelInteger("excel", "hello1", a, b, array[i]);
            //objExcelFile.writeExcelInteger("excel",);

            // }
        }

    }

}


