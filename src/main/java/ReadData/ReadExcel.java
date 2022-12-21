package ReadData;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
       String excelFilepath="Advance-JAVA/src/datafiles/data1.xlsx";
//String excelFilepath="C:\\Users\\Kaviya.V\\IdeaProjects\\Advanced_Java\\Advance-JAVA\\src\\Datafiles\WriteOperation.xlsx";

        FileInputStream file=new FileInputStream(excelFilepath);
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet Sheet =workbook.getSheet("Sheet1");
        int rows =Sheet.getLastRowNum();
        int cols= Sheet.getRow(1).getLastCellNum();
        for (int r=0;r<=rows;r++)
        {
            XSSFRow row=Sheet.getRow(r);
            for (int c=0;c<cols;c++)
            {
                XSSFCell cell= row.getCell(c);
                switch (cell.getCellType())
                {
                    case STRING ->    {
                        System.out.println(cell.getStringCellValue());

                    }

                    case NUMERIC -> {
                        System.out.println(cell.getNumericCellValue());
                    }

                    case BOOLEAN -> {
                        System.out.println(cell.getBooleanCellValue());
                    }


                }

            }
            System.out.println();
        }
    }
}


