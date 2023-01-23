package Collections.Kaviya;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ReadDataExcel {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("C:\\Users\\Kaviya.V\\IdeaProjects\\Advance-JAVA\\src\\datafiles\\Hash.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Movie List");
        HashMap<Integer,String> map=new HashMap<>();


        for (int i = 0; i<= sheet.getLastRowNum(); i++) {

            int key=(int)sheet.getRow(i).getCell(0).getNumericCellValue();
            String value=sheet.getRow(i).getCell(1).getStringCellValue();


            map.put(key,value);
        }

        /*Iterator<Map.Entry<Integer,String>> new_Iterator=map.entrySet().iterator();
        while(new_Iterator.hasNext()){
            Map.Entry<Integer,String>new_Map=(Map.Entry<Integer,String>)new_Iterator.next();*/
        for(Map.Entry me:map.entrySet()){
            System.out.println(me.getKey()+"  "+me.getValue());

        }
        wb.close();
        fis.close();

    }
}
