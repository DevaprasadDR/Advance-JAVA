package ExcelWriter;

import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;


public class  TestCase extends ExcelUtilities {
        public static void main(String [] args) throws Exception {



            ExcelUtilities objExcelFile = new ExcelUtilities();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of Strings you want to store: ");
            int q = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the row");
            int m = sc.nextInt();

            Scanner sc2 = new Scanner(System.in);


            String[] array = new String[10];
            System.out.println("Enter the Strings to store in a cell: ");
            for (int i = 0; i <q ; i++) {

                array[i] = String.valueOf(sc.next());

            }

            System.out.println("cell numbers are: ");
            int n = sc.nextInt();


            for (int i = 0; i <q; i++) {
               // String[] array = new String[0];
                objExcelFile.writeExcelString("Hello","hello1",m,n, (array[i]));


            }

            System.out.println(" file is created Successfully");


        }
}


