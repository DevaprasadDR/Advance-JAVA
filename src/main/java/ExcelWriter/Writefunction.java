package ExcelWriter;

import java.io.IOException;


public class Writefunction extends Writeexcel {
    public static void main(String [] args) throws IOException {
        Writeexcel objExcelFile = new Writeexcel();


        objExcelFile.readExcel( "src/Datafile","data.xlsx", "numbers" );



    }
}


