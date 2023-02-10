package Collections.Devaprasad.Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Readexcelofset {
    public static void main(String[] args) throws IOException {


    FileInputStream fis = new FileInputStream("src/Datafile/Set.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet = wb.getSheet("Sheet1");
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int n = sc.nextInt();
    Set<Integer> data=new HashSet<>();

        for (int i = 0; i<= sheet.getLastRowNum(); i++) {
            double value=sheet.getRow(i).getCell(n).getNumericCellValue();


        data.add((int) value);
    }
        for (Integer b : data ) {
        System.out.println(b);

    }
}
}

