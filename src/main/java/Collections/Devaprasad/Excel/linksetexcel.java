package Collections.Devaprasad.Excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class linksetexcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("sheet1");
        HashSet<Integer> lh = new HashSet<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of values you want to store");
        int num = in.nextInt();
        Scanner sc1 = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            System.out.println("add elements");
            Integer a = sc1.nextInt();
            lh.add(a);
            int rowno = 0;
            for (Integer b : lh) {
                XSSFRow row = sheet.createRow(rowno++);

                Scanner sc2 = new Scanner(System.in);
                System.out.println("cell number are: ");
                    row.createCell(sc2.nextInt()).setCellValue(b);
                FileOutputStream file = new FileOutputStream("src/Datafile/Interger.xlsx");
                wb.write(file);

            }
            System.out.println("linkedHashSet : " + lh + "\n");

        }

    }
}

