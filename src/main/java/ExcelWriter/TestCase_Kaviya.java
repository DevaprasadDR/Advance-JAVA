package ExcelWriter;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Scanner;

public class TestCase_Kaviya {

    public static void main(String[] args) throws Exception {
        ExcelUtilities objExcelFile = new ExcelUtilities();

//        FileInputStream inp = new FileInputStream("C:\\Users\\Kaviya.V\\IdeaProjects\\Advanced_Java\\Advance-JAVA\\src\\datafiles\\ReadData.xlsx" + ""))
//        {
//            Workbook wb = WorkbookFactory.create(inp);
//            Sheet sheet = wb.getSheetAt(0);
//            Scanner sc1 = new Scanner(System.in);
//            System.out.println("Enter x");
//            Row x = sheet.getRow(sc1.nextInt());
//            Scanner sc2 = new Scanner(System.in);
//            System.out.println("Enter y: ");
//            Cell y = x.getCell(sc2.nextInt());
//            if (y != null)
//                System.out.println("Data: " + y);
//            else
//                System.out.println("Cell is empty");

            int n=0;
            String Value = "";
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    Value = objExcelFile.readExcel("Hello", "hello1", i, j);
                System.out.println(Value);
            }
        }
    }

