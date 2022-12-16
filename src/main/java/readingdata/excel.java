package readingdata;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.*;
import java.io.FileInputStream;
import java.io.IOException;

public class excel
{

    public static void main(String[] args) throws IOException {
        String excelFilepath="src/datafiles/Addition.xlsx";
       // String excelFilepath = "https://ibase1-my.sharepoint.com/:x:/r/personal/deva_prasad_qualitestgroup_com/_layouts/15/Doc.aspx?sourcedoc=%7BBAA1D473-FACD-4E41-85C4-4105C464C9F9%7D&file=Book%203.xlsx&action=editnew&mobileredirect=true&login_hint=Deva.Prasad%40qualitestgroup.com&wdNewAndOpenCt=1671105298643&ct=1671105298643&wdPreviousSession=2cc5080f-73f6-4a8f-a33e-ca73af66d97b&wdOrigin=OFFICECOM-WEB.START.NEW";

            FileInputStream file=new FileInputStream(excelFilepath);
             XSSFWorkbook workbook=new XSSFWorkbook(file);
             XSSFSheet Sheet =workbook.getSheet("Sheet1");
             int row =Sheet.getLastRowNum();
             int col= Sheet.getRow(1).getLastCellNum();
             for (int i=0;i<=row;i++)
             {
                XSSFRow r=Sheet.getRow(i);
                 for (int c=0;c<col;c++)
                 {
                    XSSFCell j= r.getCell(c);
                     switch (j.getCellType())
                     {
                         case STRING ->    {
                             System.out.println(j.getStringCellValue());

                         }

                         case NUMERIC -> {
                             System.out.println(j.getNumericCellValue());
                         }

                         case BOOLEAN -> {
                             System.out.println(j.getBooleanCellValue());
                         }


                     }

                 }
                 System.out.println();
             }
    }
}

