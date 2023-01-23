package Collections.Kaviya;

import org.apache.poi.xssf.usermodel.XSSFAutoFilter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class WriteExcelHashmap {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("sheet1");
        HashMap<String, String> map = new HashMap<String, String>();
       /* map.put("4","Kaviya");
        map.put("1","Sathiya");
        map.put("2","Rosh");*/
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int num = in.nextInt();
        Scanner sc1 = new Scanner(System.in);


        for (int i = 0; i < num; i++) {
            System.out.println("add elements");
            String a = sc1.next();
            String b = sc1.next();

            map.put(a, b);
            int rowno = 0;
            for (Map.Entry entry : map.entrySet()) {
                XSSFRow row = sheet.createRow(rowno++);
                row.createCell(0).setCellValue((String) entry.getKey());
                row.createCell(1).setCellValue((String) entry.getValue());
            }
            FileOutputStream file = new FileOutputStream("C:\\Users\\Kaviya.V\\IdeaProjects\\Advance-JAVA\\src\\datafiles\\writefile.xlsx");
            wb.write(file);
            file.close();
            System.out.println("Excel written data succesfully");
        }
    }
}




