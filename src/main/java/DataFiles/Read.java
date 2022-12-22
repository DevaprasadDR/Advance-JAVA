package DataFiles;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try (InputStream inp = new FileInputStream("C:\\Users\\Kaviya.V\\IdeaProjects\\Advanced_Java\\Advance-JAVA\\src\\datafiles\\ReadData.xlsx" + "")) {
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the row");
            Row row = sheet.getRow(sc1.nextInt());
            Scanner sc2 = new Scanner(System.in);
            System.out.println("cell number are: ");
            Cell cell = row.getCell(sc2.nextInt());
            if (cell != null)
                System.out.println("Data: "+cell);
            else
                System.out.println("Cell is empty");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}

