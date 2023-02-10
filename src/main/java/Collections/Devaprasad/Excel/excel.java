package Collections.Devaprasad.Excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class excel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("data");
        LinkedHashSet<Integer> al = new LinkedHashSet<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of values you want to store");
        int num = in.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the row");
        XSSFRow row1 = sheet.createRow(sc1.nextInt());
        for (int i = 0; i < num; i++) {
            System.out.println("add elements");
            Integer a = sc1.nextInt();
            al.add(a);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("cell number are: ");
            for (Integer b : al) {

                row1.createCell(sc2.nextInt()).setCellValue(b);
                FileOutputStream file = new FileOutputStream("src/Datafile/new.xlsx");
                workbook.write(file);
            }
            System.out.println("linkedHashSet : " + al + "\n");

        }
    }
}