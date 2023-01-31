package Collections.Jyothi;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class WriteList {
    public static  void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Numbers");


        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Strings you want to store: ");
        int data = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the row");
        //int row=sc1.nextInt();

        XSSFRow row1 = sheet.createRow(sc1.nextInt());
        Scanner sc2 = new Scanner(System.in);


        //String[] array = new String[10];
        System.out.println("Enter the Strings to store in a cell: ");
        String data1=sc2.next();

        for (int j = 0; j < data ; j++) {
            list.add(String.valueOf(j));

        }

        System.out.println("cell numbers are: ");

        //System.out.println(array[i]);
        for (int j = 0; j < data; j++) {
            row1.createCell(sc1.nextInt()).setCellValue( list.add(String.valueOf(j)));

        }
        System.out.println(list);

        FileOutputStream file = new FileOutputStream("src/Datafile/ArrayFile.xlsx");

        workbook.write(file);
        file.close();
        System.out.println(" file is created Successfully");
    }
}



