package DataFiles;

import java.io.FileNotFoundException;

public class Main  {

    public static void main(String[] args) throws FileNotFoundException {
        Read rc=new Read("C:\\Users\\Kaviya.V\\IdeaProjects\\Advanced_Java\\Advance-JAVA\\src\\datafiles\\ReadData.xlsx");
       // rc.SetData();
        rc.readSetData();

    }
}
