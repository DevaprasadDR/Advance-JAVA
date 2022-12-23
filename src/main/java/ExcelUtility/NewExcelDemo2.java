package ExcelReader;

import com.sun.tools.javac.Main;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class NewExcelDemo2 {

    public static void main(String[] args) throws IOException {


        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Strings you want to store: ");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the row");
        //int row=sc1.nextInt();

        XSSFRow row1 = sheet.createRow(sc1.nextInt());
        Scanner sc2 = new Scanner(System.in);


        String[] array = new String[10];
        System.out.println("Enter the Strings to store in a cell: ");
        for (int i = 0; i < n ; i++) {

            array[i] = String.valueOf(sc.next());
        }

            System.out.println("cell numbers are: ");

            //System.out.println(array[i]);
            for (int i = 0; i < n; i++) {
                row1.createCell(sc1.nextInt()).setCellValue(array[i]);
            }

            FileOutputStream file = new FileOutputStream("C:\\Users\\sathiyapriya.s\\IdeaProjects\\Advance-JAVA\\src\\Datafile\\Newfile.xlsx");
            workbook.write(file);
            file.close();
            System.out.println(" file is created Successfully");


        }
    }


