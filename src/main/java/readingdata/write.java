package readingdata;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("operations");

        Object empdata[] [] ={ {"Num1","Num2","Result"  } ,
                {"12","10"," "},
                {"33","4",""}

        };
        int row=empdata.length;
        int col=empdata[0].length;
        System.out.println(row);
        System.out.println(col);
        for (int r=0;r<row;r++)
        {
            XSSFRow row1= sheet.createRow(r);
            for (int c=0;c<col;c++)
            {
                XSSFCell cell= row1.createCell(col);
                Object value=empdata[r][c];
                if (value instanceof String)
                    cell.setCellValue((String) value);
                if (value instanceof Integer)
                    cell.setCellValue((Integer)value);
                if (value instanceof Boolean)
                    cell.setCellValue((Boolean)value);
            }
        }
        String filepath="src/datafiles/data.xlsx";
        FileOutputStream outputStream=new FileOutputStream(filepath);
        workbook.write(outputStream);
        outputStream.close();
        System.out.println("sucessfull");


    }
}
