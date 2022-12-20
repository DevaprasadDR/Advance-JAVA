package ExcelReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteOperation {

        public static void main(String[] args)throws IOException{

            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet sheet=workbook.createSheet("Numbers");

            XSSFRow row1=sheet.createRow(0);
            row1.createCell(0).setCellValue(10);
            row1.createCell(1).setCellValue(20);
            row1.createCell(2).setCellFormula("A1+B1");

            XSSFRow row2=sheet.createRow(1);
            row2.createCell(0).setCellValue(10);
            row2.createCell(1).setCellValue(5);
            row2.createCell(2).setCellFormula("A2-B2");

            XSSFRow row3=sheet.createRow(2);
            row3.createCell(0).setCellValue(10);
            row3.createCell(1).setCellValue(6);
            row3.createCell(2).setCellFormula("A3*B3");

            XSSFRow row4=sheet.createRow(3);
            row4.createCell(0).setCellValue(10);
            row4.createCell(1).setCellValue(6);
            row4.createCell(2).setCellFormula("A4/B4");


            FileOutputStream file = new FileOutputStream("C:\\Users\\sathiyapriya.s\\IdeaProjects\\Advance-JAVA\\src\\Datafile\\WriteMethod.xlsx");
            workbook.write(file);
            file.close();
            System.out.println("WriteMethod file is created with Formula cell");

        }
    }


