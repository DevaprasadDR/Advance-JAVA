package ReadData;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadCellExample {
    public static void main(String[] args)
    {
        ReadCellExample rc=new ReadCellExample();
        Scanner sc=new Scanner(System.in);
        String vOutput=rc.ReadCellData(2, 0);
        System.out.println(vOutput);
    }
    public String ReadCellData(int vRow, int vColumn)
    {
        String value=null;
        Workbook wb=null;
        try
        {

            FileInputStream fis=new FileInputStream("C:\\Users\\Kaviya.V\\IdeaProjects\\Advanced_Java\\Advance-JAVA\\src\\datafiles\\Book 5.xlsx");
            wb=new XSSFWorkbook(fis);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        Sheet sheet=wb.getSheetAt(0);
        Row row=sheet.getRow(vRow);
        Cell cell=row.getCell(vColumn);
        value=cell.getStringCellValue();
        return value;
    }
}

