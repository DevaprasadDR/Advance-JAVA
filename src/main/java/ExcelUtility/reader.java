package ExcelUtility;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the row");
        //int row=sc1.nextInt();

        XSSFRow row1 = sheet.createRow(sc1.nextInt());
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
            //System.out.println(array[i]);
            row1.createCell(sc1.nextInt()).setCellValue(array[i] );
        }
        FileOutputStream file = new FileOutputStream("src/Datafile/Write.xlsx");
                workbook.write(file);
                file.close();
                System.out.println(" file is created Sucessfully");


        }
    }
