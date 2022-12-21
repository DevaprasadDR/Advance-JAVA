package ExcelReader;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.*;
import java.io.FileInputStream;
import java.io.IOException;


public class Reader {
    public static void main(String[] args) throws IOException {
        String excelFilepath ="C:\\Users\\sathiyapriya.s\\IdeaProjects\\Advance-JAVA\\src\\Datafile\\Book 4 - Copy.xlsx" ;


        FileInputStream file = new FileInputStream(excelFilepath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet Sheet = workbook.getSheet("Sheet1");
        int row = Sheet.getLastRowNum();
        int col = Sheet.getRow(1).getLastCellNum();
        for (int i = 0; i <= row; i++) {
            XSSFRow r = Sheet.getRow(i);
            for (int c = 0; c < col; c++) {
                XSSFCell j = r.getCell(c);
                switch (j.getCellType()) {
                    case STRING -> {
                        System.out.println(j.getStringCellValue());


                    }

                    case NUMERIC -> {
                        System.out.println(j.getNumericCellValue());
                        break;

                    }

                    case BOOLEAN -> {
                        System.out.println(j.getBooleanCellValue());
                        break;

                    }


                }

            }
            System.out.println();
        }
    }
}


