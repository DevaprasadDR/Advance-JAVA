package ExcelWriter;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.Scanner;

public class TestCase_Kaviya extends ExcelUtilities {

    public static void main(String[] args) throws Exception {
        ExcelUtilities objExcelFile = new ExcelUtilities();

        // FileInputStream inp = new FileInputStream("C:\\Users\\Kaviya.V\\IdeaProjects\\Advanced_Java\\Advance-JAVA\\src\\datafiles\\ReadData.xlsx" + ""))

           // Workbook wb = WorkbookFactory.create(inp);
           //Sheet sheet = wb.getSheetAt(0);
           Scanner sc1 = new Scanner(System.in);
           System.out.println("Enter x");
           //Row x = sheet.getRow(sc1.nextInt());
           int x= sc1.nextInt();
           Scanner sc2 = new Scanner(System.in);
           System.out.println("Enter y: ");
           int y= sc2.nextInt();

           // Cell y = x.getCell(sc2.nextInt());
           if (y != 0)
                System.out.println("Data: " + y);
           else
                System.out.println("Cell is empty");
           objExcelFile.readExcel("ReadData","Sheet1",2,3);



        }
    }

