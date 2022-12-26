package DataFiles;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Read {

        String xlFilePath = " ";
        XSSFWorkbook wb;
        XSSFSheet sheet;
       // FileInputStream inp=null;

    public Read(String xlFilePath) {
        try{
            this.xlFilePath=xlFilePath;
                  FileInputStream inp = new FileInputStream(new File(this.xlFilePath));
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


   /* public void SetData() {
        Sheet sheet = wb.getSheetAt(0);

    }*/
    public void readSetData(){
        //Sheet sheet = wb.getSheetAt(0);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter x");
        Row x = sheet.getRow(sc1.nextInt());
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter y: ");
        Cell y = x.getCell(sc2.nextInt());
        if (y != null)
            System.out.println("Data: "+y);
        else
            System.out.println("Cell is empty");
    }

}