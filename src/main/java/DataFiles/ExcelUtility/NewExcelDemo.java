package DataFiles.ExcelUtility;


// Java program to write data in excel sheet using java code

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class NewExcelDemo {

    // any exceptions need to be caught
    public static void main(String[] args) throws Exception {
        // workbook object
        XSSFWorkbook workbook = new XSSFWorkbook();

        // spreadsheet object
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Strings you want to store: ");
//reading the number of elements from the that we want to enter
        n = sc.nextInt();
//creates an array in the memory of length 10
        String[] array = new String[10];
        System.out.println("Enter the Strings: ");
        for (int i = 0; i < n; i++) {
//reading array elements from the user
            array[i] = String.valueOf(sc.next());
        }
        System.out.println("strings are: ");
// accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);

            FileOutputStream file = new FileOutputStream("C:\\Users\\sathiyapriya.s\\IdeaProjects\\Advance-JAVA\\src\\Datafile\\ExcelData.xlsx");
            workbook.write(file);
            file.close();
            System.out.println("WriteMethod file is created");

        }
    }
        }












