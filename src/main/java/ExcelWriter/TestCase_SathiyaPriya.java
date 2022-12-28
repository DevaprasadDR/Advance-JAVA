package ExcelWriter;

import java.util.Scanner;

public class TestCase_SathiyaPriya {

        public static void main(String [] args) throws Exception {

            ExcelUtilities objExcelFile = new ExcelUtilities();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");
            int n = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the row");
            Scanner sc2 = new Scanner(System.in);

            int[] array = new int[10];
            System.out.println("Enter the data to store in a cell: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
            System.out.println("cell number are: ");

            for (int i=0; i<n; i++)
            {
                for (int j=0;j<n; j++)
                    objExcelFile.writeExcelInteger("Hello","hello1",i,j, array[i]);

            }

        }

    }
