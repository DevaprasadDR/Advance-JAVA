package ExcelWriter;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExcelUtilities {

    public void createExcel(String fileName,String sheetname) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetname);
        FileOutputStream file = new FileOutputStream("src/Datafile/"+fileName+".xlsx");
        workbook.write(file);
    }
    public void writeExcelString(String filename, String sheetname, int RowNumber,int ColumnNumber,String Value) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetname);
        XSSFRow rownum = sheet.createRow(RowNumber);
        for (int j=0;j<=10;j++) {
            rownum.createCell(ColumnNumber).setCellValue(Value);
        }
        FileOutputStream output_file =new FileOutputStream("src/Datafile/" + filename + ".xlsx");
        workbook.write(output_file);
    }

    public void writeExcelInteger(String filename, String sheetname, int RowNumber,int ColumnNumber,int Value) throws IOException {
        String excelFilePath ="src/Datafile/" + filename + ".xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet(sheetname);
        inputStream.close();
               // XSSFWorkbook workbook = new XSSFWorkbook();
        //XSSFSheet sheet = workbook.createSheet(sheetname);
        Row rownum = sheet.createRow(RowNumber);
        rownum.createCell(ColumnNumber).setCellValue(Value);
        FileOutputStream output_file =new FileOutputStream("src/Datafile/" + filename + ".xlsx");
        workbook.write(output_file);
    }

    public String readExcel(String filename, String sheetname, int RowNumber,int ColumnNumber) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        FileInputStream file = new FileInputStream("src/datafiles/" + filename + ".xlsx");
        XSSFSheet sheet = workbook.getSheet(sheetname);
        XSSFRow rownum = sheet.getRow(RowNumber);
        String Value=rownum.getCell(ColumnNumber).getStringCellValue();
        return Value;
    }
        }




